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
 * Tax Withheld Component
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazonaws.mws.finances.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * TaxWithheldComponent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TaxWithheldComponent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TaxCollectionModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TaxesWithheld" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class TaxWithheldComponent extends AbstractMwsObject {

    private String taxCollectionModel;

    private List<ChargeComponent> taxesWithheld;

    /**
     * Get the value of TaxCollectionModel.
     *
     * @return The value of TaxCollectionModel.
     */
    public String getTaxCollectionModel() {
        return taxCollectionModel;
    }

    /**
     * Set the value of TaxCollectionModel.
     *
     * @param taxCollectionModel
     *            The new value to set.
     */
    public void setTaxCollectionModel(String taxCollectionModel) {
        this.taxCollectionModel = taxCollectionModel;
    }

    /**
     * Check to see if TaxCollectionModel is set.
     *
     * @return true if TaxCollectionModel is set.
     */
    public boolean isSetTaxCollectionModel() {
        return taxCollectionModel != null;
    }

    /**
     * Set the value of TaxCollectionModel, return this.
     *
     * @param taxCollectionModel
     *             The new value to set.
     * @return This instance.
     */
    public TaxWithheldComponent withTaxCollectionModel(String taxCollectionModel) {
        this.taxCollectionModel = taxCollectionModel;
        return this;
    }

    /**
     * Get the value of TaxesWithheld.
     *
     * @return The value of TaxesWithheld.
     */
    public List<ChargeComponent> getTaxesWithheld() {
        if (taxesWithheld==null) {
            taxesWithheld = new ArrayList<ChargeComponent>();
        }
        return taxesWithheld;
    }

    /**
     * Set the value of TaxesWithheld.
     *
     * @param taxesWithheld
     *            The new value to set.
     */
    public void setTaxesWithheld(List<ChargeComponent> taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
    }

    /**
     * Clear TaxesWithheld.
     */
    public void unsetTaxesWithheld() {
        this.taxesWithheld = null;
    }

    /**
     * Check to see if TaxesWithheld is set.
     *
     * @return true if TaxesWithheld is set.
     */
    public boolean isSetTaxesWithheld() {
        return taxesWithheld != null && !taxesWithheld.isEmpty();
    }

    /**
     * Add values for TaxesWithheld, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.finances.model.ChargeComponent} object.
     */
    public TaxWithheldComponent withTaxesWithheld(ChargeComponent... values) {
        List<ChargeComponent> list = getTaxesWithheld();
        for (ChargeComponent value : values) {
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
        taxCollectionModel = r.read("TaxCollectionModel", String.class);
        taxesWithheld = r.readList("TaxesWithheld", "ChargeComponent", ChargeComponent.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TaxCollectionModel", taxCollectionModel);
        w.writeList("TaxesWithheld", "ChargeComponent", taxesWithheld);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "TaxWithheldComponent",this);
    }


    /**
     * Default constructor.
     */
    public TaxWithheldComponent() {
        super();
    }

}
