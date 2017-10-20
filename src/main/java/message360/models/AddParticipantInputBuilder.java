/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class AddParticipantInputBuilder {
    //the instance to build
    private AddParticipantInput addParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public AddParticipantInputBuilder() {
        addParticipantInput = new AddParticipantInput();
    }

    /**
     * Unique Conference Sid
     */
    public AddParticipantInputBuilder conferencesid(String conferencesid) {
        addParticipantInput.setConferencesid(conferencesid);
        return this;
    }

    /**
     * Particiant Number
     */
    public AddParticipantInputBuilder participantnumber(String participantnumber) {
        addParticipantInput.setParticipantnumber(participantnumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public AddParticipantInputBuilder responseType(String responseType) {
        addParticipantInput.setResponseType(responseType);
        return this;
    }

    /**
     * add muted
     */
    public AddParticipantInputBuilder muted(Boolean muted) {
        addParticipantInput.setMuted(muted);
        return this;
    }

    /**
     * add without volume
     */
    public AddParticipantInputBuilder deaf(Boolean deaf) {
        addParticipantInput.setDeaf(deaf);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddParticipantInput build() {
        return addParticipantInput;
    }
}