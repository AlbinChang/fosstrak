/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.05 at 05:03:34 PM CEST 
//


package org.accada.reader.rprm.core.msg.command;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.accada.reader.rprm.core.msg.command.NoParamType;
import org.accada.reader.rprm.core.msg.command.TagFieldCommand;
import org.accada.reader.rprm.core.msg.command.TagFieldCommand.Create;
import org.accada.reader.rprm.core.msg.command.TagFieldCommand.SetLength;
import org.accada.reader.rprm.core.msg.command.TagFieldCommand.SetMemoryBank;
import org.accada.reader.rprm.core.msg.command.TagFieldCommand.SetOffset;
import org.accada.reader.rprm.core.msg.command.TagFieldCommand.SetTagFieldName;


/**
 * <p>Java class for TagFieldCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagFieldCommand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="create">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="getName" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="getTagFieldName" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="setTagFieldName">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tagFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="getMemoryBank" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="setMemoryBank">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memoryBank" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="getOffset" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="setOffset">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="getLength" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="setLength">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagFieldCommand", propOrder = {
    "create",
    "getName",
    "getTagFieldName",
    "setTagFieldName",
    "getMemoryBank",
    "setMemoryBank",
    "getOffset",
    "setOffset",
    "getLength",
    "setLength"
})
public class TagFieldCommand {

    protected Create create;
    protected NoParamType getName;
    protected NoParamType getTagFieldName;
    protected SetTagFieldName setTagFieldName;
    protected NoParamType getMemoryBank;
    protected SetMemoryBank setMemoryBank;
    protected NoParamType getOffset;
    protected SetOffset setOffset;
    protected NoParamType getLength;
    protected SetLength setLength;

    /**
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link Create }
     *     
     */
    public Create getCreate() {
        return create;
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link Create }
     *     
     */
    public void setCreate(Create value) {
        this.create = value;
    }

    /**
     * Gets the value of the getName property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getGetName() {
        return getName;
    }

    /**
     * Sets the value of the getName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setGetName(NoParamType value) {
        this.getName = value;
    }

    /**
     * Gets the value of the getTagFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getGetTagFieldName() {
        return getTagFieldName;
    }

    /**
     * Sets the value of the getTagFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setGetTagFieldName(NoParamType value) {
        this.getTagFieldName = value;
    }

    /**
     * Gets the value of the setTagFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link SetTagFieldName }
     *     
     */
    public SetTagFieldName getSetTagFieldName() {
        return setTagFieldName;
    }

    /**
     * Sets the value of the setTagFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTagFieldName }
     *     
     */
    public void setSetTagFieldName(SetTagFieldName value) {
        this.setTagFieldName = value;
    }

    /**
     * Gets the value of the getMemoryBank property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getGetMemoryBank() {
        return getMemoryBank;
    }

    /**
     * Sets the value of the getMemoryBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setGetMemoryBank(NoParamType value) {
        this.getMemoryBank = value;
    }

    /**
     * Gets the value of the setMemoryBank property.
     * 
     * @return
     *     possible object is
     *     {@link SetMemoryBank }
     *     
     */
    public SetMemoryBank getSetMemoryBank() {
        return setMemoryBank;
    }

    /**
     * Sets the value of the setMemoryBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetMemoryBank }
     *     
     */
    public void setSetMemoryBank(SetMemoryBank value) {
        this.setMemoryBank = value;
    }

    /**
     * Gets the value of the getOffset property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getGetOffset() {
        return getOffset;
    }

    /**
     * Sets the value of the getOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setGetOffset(NoParamType value) {
        this.getOffset = value;
    }

    /**
     * Gets the value of the setOffset property.
     * 
     * @return
     *     possible object is
     *     {@link SetOffset }
     *     
     */
    public SetOffset getSetOffset() {
        return setOffset;
    }

    /**
     * Sets the value of the setOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOffset }
     *     
     */
    public void setSetOffset(SetOffset value) {
        this.setOffset = value;
    }

    /**
     * Gets the value of the getLength property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getGetLength() {
        return getLength;
    }

    /**
     * Sets the value of the getLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setGetLength(NoParamType value) {
        this.getLength = value;
    }

    /**
     * Gets the value of the setLength property.
     * 
     * @return
     *     possible object is
     *     {@link SetLength }
     *     
     */
    public SetLength getSetLength() {
        return setLength;
    }

    /**
     * Sets the value of the setLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetLength }
     *     
     */
    public void setSetLength(SetLength value) {
        this.setLength = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class Create {

        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "length"
    })
    public static class SetLength {

        @XmlElement(type = Integer.class)
        protected int length;

        /**
         * Gets the value of the length property.
         * 
         */
        public int getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         */
        public void setLength(int value) {
            this.length = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="memoryBank" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memoryBank"
    })
    public static class SetMemoryBank {

        protected BigInteger memoryBank;

        /**
         * Gets the value of the memoryBank property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMemoryBank() {
            return memoryBank;
        }

        /**
         * Sets the value of the memoryBank property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMemoryBank(BigInteger value) {
            this.memoryBank = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offset"
    })
    public static class SetOffset {

        @XmlElement(type = Integer.class)
        protected int offset;

        /**
         * Gets the value of the offset property.
         * 
         */
        public int getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         */
        public void setOffset(int value) {
            this.offset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tagFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tagFieldName"
    })
    public static class SetTagFieldName {

        protected String tagFieldName;

        /**
         * Gets the value of the tagFieldName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTagFieldName() {
            return tagFieldName;
        }

        /**
         * Sets the value of the tagFieldName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTagFieldName(String value) {
            this.tagFieldName = value;
        }

    }

}
