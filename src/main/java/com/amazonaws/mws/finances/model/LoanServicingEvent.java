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
 * Loan Servicing Event
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazonaws.mws.finances.model;

import com.amazonservices.mws.client.*;

/**
 * LoanServicingEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LoanServicingEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="LoanAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="SourceBusinessEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class LoanServicingEvent extends AbstractMwsObject {

    private Currency loanAmount;

    private String sourceBusinessEventType;

    /**
     * Get the value of LoanAmount.
     *
     * @return The value of LoanAmount.
     */
    public Currency getLoanAmount() {
        return loanAmount;
    }

    /**
     * Set the value of LoanAmount.
     *
     * @param loanAmount
     *            The new value to set.
     */
    public void setLoanAmount(Currency loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Check to see if LoanAmount is set.
     *
     * @return true if LoanAmount is set.
     */
    public boolean isSetLoanAmount() {
        return loanAmount != null;
    }

    /**
     * Set the value of LoanAmount, return this.
     *
     * @param loanAmount
     *             The new value to set.
     * @return This instance.
     */
    public LoanServicingEvent withLoanAmount(Currency loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    /**
     * Get the value of SourceBusinessEventType.
     *
     * @return The value of SourceBusinessEventType.
     */
    public String getSourceBusinessEventType() {
        return sourceBusinessEventType;
    }

    /**
     * Set the value of SourceBusinessEventType.
     *
     * @param sourceBusinessEventType
     *            The new value to set.
     */
    public void setSourceBusinessEventType(String sourceBusinessEventType) {
        this.sourceBusinessEventType = sourceBusinessEventType;
    }

    /**
     * Check to see if SourceBusinessEventType is set.
     *
     * @return true if SourceBusinessEventType is set.
     */
    public boolean isSetSourceBusinessEventType() {
        return sourceBusinessEventType != null;
    }

    /**
     * Set the value of SourceBusinessEventType, return this.
     *
     * @param sourceBusinessEventType
     *             The new value to set.
     * @return This instance.
     */
    public LoanServicingEvent withSourceBusinessEventType(String sourceBusinessEventType) {
        this.sourceBusinessEventType = sourceBusinessEventType;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        loanAmount = r.read("LoanAmount", Currency.class);
        sourceBusinessEventType = r.read("SourceBusinessEventType", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("LoanAmount", loanAmount);
        w.write("SourceBusinessEventType", sourceBusinessEventType);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "LoanServicingEvent",this);
    }


    /**
     * Default constructor.
     */
    public LoanServicingEvent() {
        super();
    }

}
