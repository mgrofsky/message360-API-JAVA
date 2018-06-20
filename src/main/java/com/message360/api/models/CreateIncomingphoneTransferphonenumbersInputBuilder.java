/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateIncomingphoneTransferphonenumbersInputBuilder {
    //the instance to build
    private CreateIncomingphoneTransferphonenumbersInput createIncomingphoneTransferphonenumbersInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateIncomingphoneTransferphonenumbersInputBuilder() {
        createIncomingphoneTransferphonenumbersInput = new CreateIncomingphoneTransferphonenumbersInput();
    }

    /**
     * A valid 10-digit Ytel number (E.164 format).
     */
    public CreateIncomingphoneTransferphonenumbersInputBuilder phonenumber(String phonenumber) {
        createIncomingphoneTransferphonenumbersInput.setPhonenumber(phonenumber);
        return this;
    }

    /**
     * A specific Accountsid from where Number is getting transfer.
     */
    public CreateIncomingphoneTransferphonenumbersInputBuilder fromaccountsid(String fromaccountsid) {
        createIncomingphoneTransferphonenumbersInput.setFromaccountsid(fromaccountsid);
        return this;
    }

    /**
     * A specific Accountsid to which Number is getting transfer.
     */
    public CreateIncomingphoneTransferphonenumbersInputBuilder toaccountsid(String toaccountsid) {
        createIncomingphoneTransferphonenumbersInput.setToaccountsid(toaccountsid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateIncomingphoneTransferphonenumbersInput build() {
        return createIncomingphoneTransferphonenumbersInput;
    }
}