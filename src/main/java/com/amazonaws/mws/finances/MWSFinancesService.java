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

/**
 * MWSFinances is a service that provides MWS developers access to Sellers
 *         payments data coming from all types of seller transactions
 *         which affect the seller account balance
 *
 * @author dmytro
 * @version $Id: $Id
 */
public interface MWSFinancesService {

    /**
     * List Financial Event Groups
     *
     * ListFinancialEventGroups can be used to find financial event groups that meet filter criteria.
     *
     * @param request
     *           ListFinancialEventGroupsRequest request.
     * @return ListFinancialEventGroupsResponse response.
     * @throws com.amazonaws.mws.finances.MWSFinancesServiceException {@link MWSFinancesServiceException}
     */
    ListFinancialEventGroupsResponse listFinancialEventGroups(
        ListFinancialEventGroupsRequest request)
        throws MWSFinancesServiceException;

    /**
     * List Financial Event Groups By Next Token
     *
     * If ListFinancialEventGroups returns a nextToken, thus indicating that there are more groups
     *         than returned that matched the given filter criteria, ListFinancialEventGroupsByNextToken
     *         can be used to retrieve those groups using that nextToken.
     *
     * @param request
     *           ListFinancialEventGroupsByNextTokenRequest request.
     * @return ListFinancialEventGroupsByNextTokenResponse response.
     * @throws com.amazonaws.mws.finances.MWSFinancesServiceException {@link MWSFinancesServiceException}
     */
    ListFinancialEventGroupsByNextTokenResponse listFinancialEventGroupsByNextToken(
        ListFinancialEventGroupsByNextTokenRequest request)
        throws MWSFinancesServiceException;

    /**
     * List Financial Events
     *
     * ListFinancialEvents can be used to find financial events that meet the specified criteria.
     *
     * @param request
     *           ListFinancialEventsRequest request.
     * @return ListFinancialEventsResponse response.
     * @throws com.amazonaws.mws.finances.MWSFinancesServiceException {@link MWSFinancesServiceException}
     */
    ListFinancialEventsResponse listFinancialEvents(
        ListFinancialEventsRequest request)
        throws MWSFinancesServiceException;

    /**
     * List Financial Events By Next Token
     *
     * If ListFinancialEvents returns a nextToken, thus indicating that there are more financial events
     *         than returned that matched the given filter criteria, ListFinancialEventsByNextToken
     *         can be used to retrieve those events using that nextToken.
     *
     * @param request
     *           ListFinancialEventsByNextTokenRequest request.
     * @return ListFinancialEventsByNextTokenResponse response.
     * @throws com.amazonaws.mws.finances.MWSFinancesServiceException {@link MWSFinancesServiceException}
     */
    ListFinancialEventsByNextTokenResponse listFinancialEventsByNextToken(
        ListFinancialEventsByNextTokenRequest request)
        throws MWSFinancesServiceException;

    /**
     * Get Service Status
     *
     * @param request
     *           GetServiceStatusRequest request.
     * @return GetServiceStatusResponse response.
     * @throws com.amazonaws.mws.finances.MWSFinancesServiceException {@link MWSFinancesServiceException}
     */
    GetServiceStatusResponse getServiceStatus(
        GetServiceStatusRequest request)
        throws MWSFinancesServiceException;

}
