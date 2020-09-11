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
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazonaws.mws.finances.model;

import java.util.List;
import java.util.Date;

import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

/**
 * ResponseHeaderMetadata
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class ResponseHeaderMetadata extends MwsResponseHeaderMetadata {

    /**
     * Value constructor.
     *
     * @param requestId a {@link java.lang.String} object.
     * @param responseContext a {@link java.util.List} object.
     * @param timestamp a {@link java.lang.String} object.
     * @param quotaMax a {@link java.lang.Double} object.
     * @param quotaRemaining a {@link java.lang.Double} object.
     * @param quotaResetsAt a {@link java.util.Date} object.
     */
    public ResponseHeaderMetadata(String requestId, List<String> responseContext, String timestamp,
                                  Double quotaMax, Double quotaRemaining, Date quotaResetsAt) {
        super(requestId, responseContext, timestamp, quotaMax, quotaRemaining, quotaResetsAt);
    }

    /**
     * Empty constructor.
     */
    public ResponseHeaderMetadata() {
        super(null, null, null, null, null, null);
    }

    /**
     * Copy constructor.
     *
     * @param rhmd a {@link com.amazonservices.mws.client.MwsResponseHeaderMetadata} object.
     */
    public ResponseHeaderMetadata(MwsResponseHeaderMetadata rhmd) {
        super(rhmd);
    }

}
