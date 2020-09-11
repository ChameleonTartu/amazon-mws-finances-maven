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
package com.amazonaws.mws.finances;

import com.amazonaws.mws.finances.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


/**
 * <p>MWSFinancesServiceAsyncClient class.</p>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class MWSFinancesServiceAsyncClient extends MWSFinancesServiceClient implements MWSFinancesServiceAsync {

    /**
     * <p>Constructor for MWSFinancesServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSFinancesServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for MWSFinancesServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSFinancesServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for MWSFinancesServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSFinancesServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for MWSFinancesServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<ListFinancialEventGroupsResponse> listFinancialEventGroupsAsync(
        ListFinancialEventGroupsRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEventGroups", ListFinancialEventGroupsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListFinancialEventGroupsByNextTokenResponse> listFinancialEventGroupsByNextTokenAsync(
        ListFinancialEventGroupsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEventGroupsByNextToken", ListFinancialEventGroupsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListFinancialEventsResponse> listFinancialEventsAsync(
        ListFinancialEventsRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEvents", ListFinancialEventsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListFinancialEventsByNextTokenResponse> listFinancialEventsByNextTokenAsync(
        ListFinancialEventsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEventsByNextToken", ListFinancialEventsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}
