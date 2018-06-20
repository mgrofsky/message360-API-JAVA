/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateConferencesListParticipantInputBuilder {
    //the instance to build
    private CreateConferencesListParticipantInput createConferencesListParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateConferencesListParticipantInputBuilder() {
        createConferencesListParticipantInput = new CreateConferencesListParticipantInput();
    }

    /**
     * The unique identifier for a conference.
     */
    public CreateConferencesListParticipantInputBuilder conferenceSid(String conferenceSid) {
        createConferencesListParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateConferencesListParticipantInputBuilder page(Integer page) {
        createConferencesListParticipantInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public CreateConferencesListParticipantInputBuilder pagesize(Integer pagesize) {
        createConferencesListParticipantInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Specifies if participant should be muted.
     */
    public CreateConferencesListParticipantInputBuilder muted(Boolean muted) {
        createConferencesListParticipantInput.setMuted(muted);
        return this;
    }

    /**
     * Specifies if the participant should hear audio in the conference.
     */
    public CreateConferencesListParticipantInputBuilder deaf(Boolean deaf) {
        createConferencesListParticipantInput.setDeaf(deaf);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateConferencesListParticipantInput build() {
        return createConferencesListParticipantInput;
    }
}