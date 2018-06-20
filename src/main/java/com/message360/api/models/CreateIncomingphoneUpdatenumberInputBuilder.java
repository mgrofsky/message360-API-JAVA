/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateIncomingphoneUpdatenumberInputBuilder {
    //the instance to build
    private CreateIncomingphoneUpdatenumberInput createIncomingphoneUpdatenumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateIncomingphoneUpdatenumberInputBuilder() {
        createIncomingphoneUpdatenumberInput = new CreateIncomingphoneUpdatenumberInput();
    }

    /**
     * A valid Ytel number (E.164 format).
     */
    public CreateIncomingphoneUpdatenumberInputBuilder phoneNumber(String phoneNumber) {
        createIncomingphoneUpdatenumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public CreateIncomingphoneUpdatenumberInputBuilder voiceUrl(String voiceUrl) {
        createIncomingphoneUpdatenumberInput.setVoiceUrl(voiceUrl);
        return this;
    }

    /**
     * Phone number friendly name description
     */
    public CreateIncomingphoneUpdatenumberInputBuilder friendlyName(String friendlyName) {
        createIncomingphoneUpdatenumberInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * Post or Get
     */
    public CreateIncomingphoneUpdatenumberInputBuilder voiceMethod(String voiceMethod) {
        createIncomingphoneUpdatenumberInput.setVoiceMethod(voiceMethod);
        return this;
    }

    /**
     * URL requested if the voice URL is not available
     */
    public CreateIncomingphoneUpdatenumberInputBuilder voiceFallbackUrl(String voiceFallbackUrl) {
        createIncomingphoneUpdatenumberInput.setVoiceFallbackUrl(voiceFallbackUrl);
        return this;
    }

    /**
     * Post or Get
     */
    public CreateIncomingphoneUpdatenumberInputBuilder voiceFallbackMethod(String voiceFallbackMethod) {
        createIncomingphoneUpdatenumberInput.setVoiceFallbackMethod(voiceFallbackMethod);
        return this;
    }

    /**
     * callback url after a hangup occurs
     */
    public CreateIncomingphoneUpdatenumberInputBuilder hangupCallback(String hangupCallback) {
        createIncomingphoneUpdatenumberInput.setHangupCallback(hangupCallback);
        return this;
    }

    /**
     * Post or Get
     */
    public CreateIncomingphoneUpdatenumberInputBuilder hangupCallbackMethod(String hangupCallbackMethod) {
        createIncomingphoneUpdatenumberInput.setHangupCallbackMethod(hangupCallbackMethod);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public CreateIncomingphoneUpdatenumberInputBuilder heartbeatUrl(String heartbeatUrl) {
        createIncomingphoneUpdatenumberInput.setHeartbeatUrl(heartbeatUrl);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed time
     */
    public CreateIncomingphoneUpdatenumberInputBuilder heartbeatMethod(String heartbeatMethod) {
        createIncomingphoneUpdatenumberInput.setHeartbeatMethod(heartbeatMethod);
        return this;
    }

    /**
     * URL requested when an SMS is received
     */
    public CreateIncomingphoneUpdatenumberInputBuilder smsUrl(String smsUrl) {
        createIncomingphoneUpdatenumberInput.setSmsUrl(smsUrl);
        return this;
    }

    /**
     * Post or Get
     */
    public CreateIncomingphoneUpdatenumberInputBuilder smsMethod(String smsMethod) {
        createIncomingphoneUpdatenumberInput.setSmsMethod(smsMethod);
        return this;
    }

    /**
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    public CreateIncomingphoneUpdatenumberInputBuilder smsFallbackUrl(String smsFallbackUrl) {
        createIncomingphoneUpdatenumberInput.setSmsFallbackUrl(smsFallbackUrl);
        return this;
    }

    /**
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    public CreateIncomingphoneUpdatenumberInputBuilder smsFallbackMethod(String smsFallbackMethod) {
        createIncomingphoneUpdatenumberInput.setSmsFallbackMethod(smsFallbackMethod);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateIncomingphoneUpdatenumberInput build() {
        return createIncomingphoneUpdatenumberInput;
    }
}