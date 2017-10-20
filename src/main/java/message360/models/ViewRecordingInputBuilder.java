/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewRecordingInputBuilder {
    //the instance to build
    private ViewRecordingInput viewRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewRecordingInputBuilder() {
        viewRecordingInput = new ViewRecordingInput();
    }

    /**
     * Search Recording sid
     */
    public ViewRecordingInputBuilder recordingSid(String recordingSid) {
        viewRecordingInput.setRecordingSid(recordingSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewRecordingInputBuilder responseType(String responseType) {
        viewRecordingInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewRecordingInput build() {
        return viewRecordingInput;
    }
}