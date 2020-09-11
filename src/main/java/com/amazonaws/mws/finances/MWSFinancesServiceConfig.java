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

import java.net.URI;
import com.amazonservices.mws.client.MwsConnection;
import com.amazonservices.mws.client.MwsUtl;

/**
 * Configuration for a connection.
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class MWSFinancesServiceConfig {

    /** The service path for this API. */
    static final String DEFAULT_SERVICE_PATH = "Finances/2015-05-01";

    /** The service path. */
    private String servicePath;

    /** A connection used to hold configuration. */
    private final MwsConnection cc = new MwsConnection();

    /**
     * Get a clone of the configured connection.
     *
     * @return A clone of the configured connection.
     */
    MwsConnection copyConnection() {
        return cc.clone();
    }

    /**
     * Gets MaxConnections property
     *
     * @return Max number of http connections
     */
    public int getMaxConnections() {
        return cc.getMaxConnections();
    }
    
    /**
     * <p>setMaxConnections.</p>
     *
     * @param maxConnections a int.
     */
    public void setMaxConnections(int maxConnections) {
        cc.setMaxConnections(maxConnections);
    }

    /**
     * <p>withMaxConnections.</p>
     *
     * @param maxConnections a int.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withMaxConnections(int maxConnections) {
        cc.setMaxConnections(maxConnections);
        return this;
    }

    /**
     * <p>isSetMaxConnections.</p>
     *
     * @return a boolean.
     */
    public boolean isSetMaxConnections() {
        return cc.getMaxConnections() > 0;
    }
    

    /**
     * Gets MaxErrorRetry property
     *
     * @return Max number of retries on 500 errors
     */
    public int getMaxErrorRetry() {
        return cc.getMaxErrorRetry();
    }
    
    /**
     * <p>setMaxErrorRetry.</p>
     *
     * @param maxErrorRetry a int.
     */
    public void setMaxErrorRetry(int maxErrorRetry) {
        cc.setMaxErrorRetry(maxErrorRetry);
    }

    /**
     * <p>withMaxErrorRetry.</p>
     *
     * @param maxErrorRetry a int.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withMaxErrorRetry(int maxErrorRetry) {
        cc.setMaxErrorRetry(maxErrorRetry);
        return this;
    }

    /**
     * <p>isSetMaxErrorRetry.</p>
     *
     * @return a boolean.
     */
    public boolean isSetMaxErrorRetry() {
        return cc.getMaxErrorRetry() > 0;
    }

    /**
     * Gets ProxyHost property
     *
     * @return Proxy Host for connection
     */
    public String getProxyHost() {
        return cc.getProxyHost();
    }
    
    /**
     * <p>setProxyHost.</p>
     *
     * @param proxyHost a {@link java.lang.String} object.
     */
    public void setProxyHost(String proxyHost) {
        cc.setProxyHost(proxyHost);
    }

    /**
     * <p>withProxyHost.</p>
     *
     * @param proxyHost a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withProxyHost(String proxyHost) {
        cc.setProxyHost(proxyHost);
        return this;
    }

    /**
     * <p>isSetProxyHost.</p>
     *
     * @return a boolean.
     */
    public boolean isSetProxyHost() {
        return cc.getProxyHost() != null;
    }

    /**
     * Gets ProxyPassword property
     *
     * @return Proxy Password
     */
    public String getProxyPassword() {
        return cc.getProxyPassword();
    }
    
    /**
     * <p>setProxyPassword.</p>
     *
     * @param proxyPassword a {@link java.lang.String} object.
     */
    public void setProxyPassword(String proxyPassword) {
        cc.setProxyPassword(proxyPassword);
    }

    /**
     * <p>withProxyPassword.</p>
     *
     * @param proxyPassword a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withProxyPassword(String proxyPassword) {
        cc.setProxyPassword(proxyPassword);
        return this;
    }

    /**
     * <p>isSetProxyPassword.</p>
     *
     * @return a boolean.
     */
    public boolean isSetProxyPassword() {
        return cc.getProxyPassword() != null;
    }

    /**
     * Gets ProxyPort property
     *
     * @return Proxy Port for connection
     */
    public int getProxyPort() {
        return cc.getProxyPort();
    }
    
     /**
      * <p>setProxyPort.</p>
      *
      * @param proxyPort a int.
      */
     public void setProxyPort(int proxyPort) {
        cc.setProxyPort(proxyPort);
    }

    /**
     * <p>withProxyPort.</p>
     *
     * @param proxyPort a int.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withProxyPort(int proxyPort) {
        cc.setProxyPort(proxyPort);
        return this;
    }

    /**
     * <p>isSetProxyPort.</p>
     *
     * @return a boolean.
     */
    public boolean isSetProxyPort() {
        return cc.getProxyPort() != -1;
    }

    /**
     * Gets ProxyUsername property
     *
     * @return Proxy Username
     */
    public String getProxyUsername() {
        return cc.getProxyUsername();
    }
    
    /**
     * <p>setProxyUsername.</p>
     *
     * @param proxyUsername a {@link java.lang.String} object.
     */
    public void setProxyUsername(String proxyUsername) {
        cc.setProxyUsername(proxyUsername);
    }

    /**
     * <p>withProxyUsername.</p>
     *
     * @param proxyUsername a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withProxyUsername(String proxyUsername) {
        cc.setProxyUsername(proxyUsername);
        return this;
    }

    /**
     * <p>isSetProxyUsername.</p>
     *
     * @return a boolean.
     */
    public boolean isSetProxyUsername() {
        return cc.getProxyUsername() != null;
    }

    /**
     * <p>getServiceVersion.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getServiceVersion() {
        return "2015-05-01";
    }

    /**
     * Gets the SignatureVersion property
     *
     * @return Signature Version
     */
    public String getSignatureVersion() {
        return cc.getSignatureVersion();
    }

    /**
     * <p>setSignatureVersion.</p>
     *
     * @param signatureVersion a {@link java.lang.String} object.
     */
    public void setSignatureVersion(String signatureVersion) {
        cc.setSignatureVersion(signatureVersion);
    }

    /**
     * <p>withSignatureVersion.</p>
     *
     * @param signatureVersion a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withSignatureVersion(String signatureVersion) {
        cc.setSignatureVersion(signatureVersion);
        return this;
    }

    /**
     * <p>isSetSignatureVersion.</p>
     *
     * @return a boolean.
     */
    public boolean isSetSignatureVersion() {
        return true;
    }

    /**
     * Gets the SignatureMethod property
     *
     * @return Signature Method
     */
    public String getSignatureMethod() {
        return cc.getSignatureMethod();
    }

    /**
     * <p>setSignatureMethod.</p>
     *
     * @param signatureMethod a {@link java.lang.String} object.
     */
    public void setSignatureMethod(String signatureMethod) {
        cc.setSignatureMethod(signatureMethod);
    }

    /**
     * <p>withSignatureMethod.</p>
     *
     * @param signatureMethod a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withSignatureMethod(String signatureMethod) {
        cc.setSignatureMethod(signatureMethod);
        return this;
    }

    /**
     * <p>isSetSignatureMethod.</p>
     *
     * @return a boolean.
     */
    public boolean isSetSignatureMethod() {
        return true;
    }

    /**
     * <p>getUserAgent.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserAgent() {
        return cc.getUserAgent();
    }

    /**
     * <p>setUserAgent.</p>
     *
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param programmingLanguage a {@link java.lang.String} object.
     * @param additionalNameValuePairs a {@link java.lang.String} object.
     */
    public void setUserAgent(String applicationName, String applicationVersion, String programmingLanguage,
            String... additionalNameValuePairs) {
        cc.setUserAgent(applicationName,applicationVersion,programmingLanguage,additionalNameValuePairs);
    }

    /**
     * <p>withUserAgent.</p>
     *
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param programmingLanguage a {@link java.lang.String} object.
     * @param additionalNameValuePairs a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withUserAgent(String applicationName, String applicationVersion,
        String programmingLanguage, String... additionalNameValuePairs) {
        cc.setUserAgent(applicationName, applicationVersion, programmingLanguage, additionalNameValuePairs);
        return this;
    }

    /**
     * <p>isSetUserAgent.</p>
     *
     * @return a boolean.
     */
    public boolean isSetUserAgent() {
        return cc.getUserAgent() != null;
    }

    /**
     * Gets the path appended after the endpoint
     *
     * @returns the path appended after the endpoint
     */
    String getServicePath() {
        return servicePath;
    }
    
    /**
     * <p>getServiceURL.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getServiceURL() {
        return cc.getEndpoint().toString() + "/" + servicePath;
    }

    /**
     * Set the service URL to make requests against.
     *
     * This can either be just the host name or can include the full path to the service.
     *
     * @param serviceUrl URL to make requests against
     */
    public void setServiceURL(String serviceUrl) {
        try {
            URI fullURI = URI.create(serviceUrl);
            URI partialURI = new URI(fullURI.getScheme(), null, fullURI.getHost(),
                fullURI.getPort(), null, null, null);
            cc.setEndpoint(partialURI);
            String path = fullURI.getPath();
            if (path != null) {
                path = path.substring(path.startsWith("/") ? 1 : 0);
                path = path.substring(0, path.length() - (path.endsWith("/") ? 1 : 0));
            }
            if (path == null || path.isEmpty()) {
                this.servicePath = DEFAULT_SERVICE_PATH;
            } else {
                this.servicePath = path;
            }
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        }
    }

    /**
     * <p>withServiceURL.</p>
     *
     * @param aserviceUrl a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withServiceURL(String aserviceUrl) {
        setServiceURL(aserviceUrl);
        return this;
    }

    /**
     * <p>isSetServiceURL.</p>
     *
     * @return a boolean.
     */
    public boolean isSetServiceURL() {
        return servicePath != null;
    }

    /**
     * Get the configured max async queue size.
     * <p>
     * This is the max number of requests to queue before executing
     * requests on the calling thread.
     *
     * @return The max async queue size property.
     */
    public int getMaxAsyncQueueSize() {
        return cc.getMaxAsyncQueueSize();
    }
    
    /**
     * <p>setMaxAsyncQueueSize.</p>
     *
     * @param size a int.
     */
    public void setMaxAsyncQueueSize(int size) {
        cc.setMaxAsyncQueueSize(size);
    }
    
    /**
     * <p>withMaxAsyncQueueSize.</p>
     *
     * @param size a int.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withMaxAsyncQueueSize(int size) {
        cc.setMaxAsyncQueueSize(size);
        return this;
    }

    /**
     * <p>isSetMaxAsyncQueueSize.</p>
     *
     * @return a boolean.
     */
    public boolean isSetMaxAsyncQueueSize() {
       return cc.getMaxAsyncQueueSize()>0;
    }

    /**
     * Get the configured max async thread count.
     * <p>
     * This is the number of async threads to process requests from the queue.
     *
     * @return The max async thread count.
     */
    public int getMaxAsyncThreads() {
        return cc.getMaxAsyncThreads();
    }

    /**
     * <p>setMaxAsyncThreads.</p>
     *
     * @param threads a int.
     */
    public void setMaxAsyncThreads(int threads) {
        cc.setMaxAsyncThreads(threads);
    }

    /**
     * <p>withMaxAsyncThreads.</p>
     *
     * @param threads a int.
     * @return a {@link com.amazonaws.mws.finances.MWSFinancesServiceConfig} object.
     */
    public MWSFinancesServiceConfig withMaxAsyncThreads(int threads) {
        cc.setMaxAsyncThreads(threads);
        return this;
    }

    /**
     * <p>isSetMaxAsyncThreads.</p>
     *
     * @return a boolean.
     */
    public boolean isSetMaxAsyncThreads() {
       return cc.getMaxAsyncThreads()>0;
    }

    /**
     * Sets the value of a request header to be included on every request
     *
     * @param name the name of the header to set
     * @param value value to send with header
     */
    public void includeRequestHeader(String name, String value) {
        cc.includeRequestHeader(name, value);
    }

    /**
     * Gets the currently set value of a request header
     *
     * @param name the name of the header to get
     * @return value of specified header, or null if not defined
     */
    public String getRequestHeader(String name) {
        return cc.getRequestHeader(name);
    }

    /**
     * Sets the value of a request header to be included on every request
     *
     * @param name the name of the header to set
     * @param value value to send with header
     * @return the current config object
     */
    public MWSFinancesServiceConfig withRequestHeader(String name, String value) {
        cc.includeRequestHeader(name, value);
        return this;
    }

    /**
     * Checks if a request header is set
     *
     * @param name the name of the header to check
     * @return true, if the header is set
     */
    public boolean isSetRequestHeader(String name) {
        return cc.getRequestHeader(name) != null;
    }
}
