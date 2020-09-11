/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Finances Service
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazonaws.mws.finances.samples;

import com.amazonaws.mws.finances.MWSFinancesServiceAsync;
import com.amazonaws.mws.finances.MWSFinancesServiceAsyncClient;
import com.amazonaws.mws.finances.MWSFinancesServiceException;
import com.amazonaws.mws.finances.model.ListFinancialEventGroupsByNextTokenRequest;
import com.amazonaws.mws.finances.model.ListFinancialEventGroupsByNextTokenResponse;
import com.amazonaws.mws.finances.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for ListFinancialEventGroupsByNextToken. */
public class ListFinancialEventGroupsByNextTokenAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param requestList
     *
     * @return The response.
     */
    public static List<Object> invokeListFinancialEventGroupsByNextToken(
            MWSFinancesServiceAsync client,
            List<ListFinancialEventGroupsByNextTokenRequest> requestList) {
        // Call the service async.
        List<Future<ListFinancialEventGroupsByNextTokenResponse>> futureList =
            new ArrayList<Future<ListFinancialEventGroupsByNextTokenResponse>>();
        for (ListFinancialEventGroupsByNextTokenRequest request : requestList) {
            Future<ListFinancialEventGroupsByNextTokenResponse> future = 
                client.listFinancialEventGroupsByNextTokenAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<ListFinancialEventGroupsByNextTokenResponse> future : futureList) {
            Object xresponse;
            try {
                ListFinancialEventGroupsByNextTokenResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof MWSFinancesServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSFinancesServiceException ex = 
                        (MWSFinancesServiceException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        MWSFinancesServiceAsyncClient client = MWSFinancesServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<ListFinancialEventGroupsByNextTokenRequest> requestList = new ArrayList<ListFinancialEventGroupsByNextTokenRequest>();
        ListFinancialEventGroupsByNextTokenRequest request = new ListFinancialEventGroupsByNextTokenRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String nextToken = "example";
        request.setNextToken(nextToken);
        requestList.add(request);

        // Make the calls.
        ListFinancialEventGroupsByNextTokenAsyncSample.invokeListFinancialEventGroupsByNextToken(client, requestList);

    }

}
