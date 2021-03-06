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
import com.amazonservices.mws.client.*;

/**
 * <p>MWSFinancesServiceClient class.</p>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class MWSFinancesServiceClient implements MWSFinancesService {

    private static final String libraryName = "MWSFinancesService";

    private static final String libraryVersion = "2020-02-21";

    protected String servicePath;

    protected final MwsConnection connection;

    /**
     * <p>Constructor for MWSFinancesServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSFinancesServiceConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    /**
     * <p>Constructor for MWSFinancesServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceClient(
            String accessKey,
            String secretKey,
            MWSFinancesServiceConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    /**
     * <p>Constructor for MWSFinancesServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSFinancesServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MWSFinancesServiceConfig());
    }

    /** {@inheritDoc} */
    public ListFinancialEventGroupsResponse listFinancialEventGroups(ListFinancialEventGroupsRequest request) {
        return connection.call(
            new RequestType("ListFinancialEventGroups", ListFinancialEventGroupsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListFinancialEventGroupsByNextTokenResponse listFinancialEventGroupsByNextToken(ListFinancialEventGroupsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListFinancialEventGroupsByNextToken", ListFinancialEventGroupsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListFinancialEventsResponse listFinancialEvents(ListFinancialEventsRequest request) {
        return connection.call(
            new RequestType("ListFinancialEvents", ListFinancialEventsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListFinancialEventsByNextTokenResponse listFinancialEventsByNextToken(ListFinancialEventsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListFinancialEventsByNextToken", ListFinancialEventsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /**
     * <p>quoteAppName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    /**
     * <p>quoteAppVersion.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    /**
     * <p>quoteAttributeName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    /**
     * <p>quoteAttributeValue.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MWSFinancesServiceException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
