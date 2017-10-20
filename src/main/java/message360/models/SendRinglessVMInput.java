/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendRinglessVMInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5466167492828474486L;
    private String from;
    private String rVMCallerId;
    private String to;
    private String voiceMailURL;
    private String responseType = "json";
    private String method = "GET";
    private String statusCallBackUrl;
    private String statsCallBackMethod;
    /** GETTER
     * This number to display on Caller ID as calling
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * This number to display on Caller ID as calling
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Alternate caller ID required for RVM
     */
    @JsonGetter("RVMCallerId")
    public String getRVMCallerId ( ) { 
        return this.rVMCallerId;
    }
    
    /** SETTER
     * Alternate caller ID required for RVM
     */
    @JsonSetter("RVMCallerId")
    public void setRVMCallerId (String value) { 
        this.rVMCallerId = value;
    }
 
    /** GETTER
     * To number
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * To number
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * URL to an audio file
     */
    @JsonGetter("VoiceMailURL")
    public String getVoiceMailURL ( ) { 
        return this.voiceMailURL;
    }
    
    /** SETTER
     * URL to an audio file
     */
    @JsonSetter("VoiceMailURL")
    public void setVoiceMailURL (String value) { 
        this.voiceMailURL = value;
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
    /** GETTER
     * Not currently used in this version
     */
    @JsonGetter("Method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Not currently used in this version
     */
    @JsonSetter("Method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * URL to post the status of the Ringless request
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * URL to post the status of the Ringless request
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
    }
 
    /** GETTER
     * POST or GET
     */
    @JsonGetter("StatsCallBackMethod")
    public String getStatsCallBackMethod ( ) { 
        return this.statsCallBackMethod;
    }
    
    /** SETTER
     * POST or GET
     */
    @JsonSetter("StatsCallBackMethod")
    public void setStatsCallBackMethod (String value) { 
        this.statsCallBackMethod = value;
    }
 
}
 