/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteAreaMailInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5414730639967057930L;
    private String areamailid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonGetter("areamailid")
    public String getAreamailid ( ) { 
        return this.areamailid;
    }
    
    /** SETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonSetter("areamailid")
    public void setAreamailid (String value) { 
        this.areamailid = value;
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 