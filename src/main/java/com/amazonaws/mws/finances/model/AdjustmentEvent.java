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
 * Adjustment Event
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazonaws.mws.finances.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * AdjustmentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AdjustmentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="AdjustmentAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="AdjustmentItemList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AdjustmentItem" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class AdjustmentEvent extends AbstractMwsObject {

    private String adjustmentType;

    private XMLGregorianCalendar postedDate;

    private Currency adjustmentAmount;

    private List<com.amazonaws.mws.finances.model.AdjustmentItem> adjustmentItemList;

    /**
     * Get the value of AdjustmentType.
     *
     * @return The value of AdjustmentType.
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Set the value of AdjustmentType.
     *
     * @param adjustmentType
     *            The new value to set.
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * Check to see if AdjustmentType is set.
     *
     * @return true if AdjustmentType is set.
     */
    public boolean isSetAdjustmentType() {
        return adjustmentType != null;
    }

    /**
     * Set the value of AdjustmentType, return this.
     *
     * @param adjustmentType
     *             The new value to set.
     * @return This instance.
     */
    public AdjustmentEvent withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * Get the value of PostedDate.
     *
     * @return The value of PostedDate.
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Set the value of PostedDate.
     *
     * @param postedDate
     *            The new value to set.
     */
    public void setPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * Check to see if PostedDate is set.
     *
     * @return true if PostedDate is set.
     */
    public boolean isSetPostedDate() {
        return postedDate != null;
    }

    /**
     * Set the value of PostedDate, return this.
     *
     * @param postedDate
     *             The new value to set.
     * @return This instance.
     */
    public AdjustmentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of AdjustmentAmount.
     *
     * @return The value of AdjustmentAmount.
     */
    public Currency getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Set the value of AdjustmentAmount.
     *
     * @param adjustmentAmount
     *            The new value to set.
     */
    public void setAdjustmentAmount(Currency adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    /**
     * Check to see if AdjustmentAmount is set.
     *
     * @return true if AdjustmentAmount is set.
     */
    public boolean isSetAdjustmentAmount() {
        return adjustmentAmount != null;
    }

    /**
     * Set the value of AdjustmentAmount, return this.
     *
     * @param adjustmentAmount
     *             The new value to set.
     * @return This instance.
     */
    public AdjustmentEvent withAdjustmentAmount(Currency adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    /**
     * Get the value of AdjustmentItemList.
     *
     * @return The value of AdjustmentItemList.
     */
    public List<com.amazonaws.mws.finances.model.AdjustmentItem> getAdjustmentItemList() {
        if (adjustmentItemList==null) {
            adjustmentItemList = new ArrayList<com.amazonaws.mws.finances.model.AdjustmentItem>();
        }
        return adjustmentItemList;
    }

    /**
     * Set the value of AdjustmentItemList.
     *
     * @param adjustmentItemList
     *            The new value to set.
     */
    public void setAdjustmentItemList(List<com.amazonaws.mws.finances.model.AdjustmentItem> adjustmentItemList) {
        this.adjustmentItemList = adjustmentItemList;
    }

    /**
     * Clear AdjustmentItemList.
     */
    public void unsetAdjustmentItemList() {
        this.adjustmentItemList = null;
    }

    /**
     * Check to see if AdjustmentItemList is set.
     *
     * @return true if AdjustmentItemList is set.
     */
    public boolean isSetAdjustmentItemList() {
        return adjustmentItemList != null && !adjustmentItemList.isEmpty();
    }

    /**
     * Add values for AdjustmentItemList, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.finances.model.AdjustmentItem} object.
     */
    public AdjustmentEvent withAdjustmentItemList(com.amazonaws.mws.finances.model.AdjustmentItem... values) {
        List<com.amazonaws.mws.finances.model.AdjustmentItem> list = getAdjustmentItemList();
        for (com.amazonaws.mws.finances.model.AdjustmentItem value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        adjustmentType = r.read("AdjustmentType", String.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        adjustmentAmount = r.read("AdjustmentAmount", Currency.class);
        adjustmentItemList = r.readList("AdjustmentItemList", "AdjustmentItem", com.amazonaws.mws.finances.model.AdjustmentItem.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AdjustmentType", adjustmentType);
        w.write("PostedDate", postedDate);
        w.write("AdjustmentAmount", adjustmentAmount);
        w.writeList("AdjustmentItemList", "AdjustmentItem", adjustmentItemList);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "AdjustmentEvent",this);
    }


    /**
     * Default constructor.
     */
    public AdjustmentEvent() {
        super();
    }

}
