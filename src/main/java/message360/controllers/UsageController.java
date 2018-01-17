/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import message360.*;
import message360.models.*;
import message360.exceptions.*;
import message360.http.client.HttpClient;
import message360.http.client.HttpContext;
import message360.http.request.HttpRequest;
import message360.http.response.HttpResponse;
import message360.http.response.HttpStringResponse;
import message360.http.client.APICallBack;
import message360.controllers.syncwrapper.APICallBackCatcher;

public class UsageController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static UsageController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the UsageController class 
     */
    public static UsageController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new UsageController();
            }
        }
        return instance;
    }

    /**
     * Retrieve usage metrics regarding your message360 account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     * @param    ListUsageInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listUsage(
                final ListUsageInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listUsageAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve usage metrics regarding your message360 account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     * @param    ListUsageInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listUsageAsync(
                final ListUsageInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/usage/listusage.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5326445026310231864L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5238681879111277615L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5309782417429517377L;
            {
                    put( "ProductCode", (input.getProductCode() != null) ? input.getProductCode().value() : 0 );
                    put( "startDate", input.getStartDate() );
                    put( "endDate", input.getEndDate() );
                    put( "IncludeSubAccounts", input.getIncludeSubAccounts() );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}