
package com.cooltrickshome;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rep_file_num",
    "CIK",
    "entity_name",
    "street1",
    "street2",
    "city",
    "state_code",
    "zip",
    "filing_date",
    "doc_type_code ",
    "extra"
})
public class Input3 {

    @JsonProperty("rep_file_num")
    private String repFileNum;
    @JsonProperty("CIK")
    private String cik;
    @JsonProperty("entity_name")
    private String entityName;
    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("filing_date")
    private String filingDate;
    @JsonProperty("doc_type_code ")
    private String docTypeCode;
    @JsonProperty("extra")
    private Integer extra;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rep_file_num")
    public String getRepFileNum() {
        return repFileNum;
    }

    @JsonProperty("rep_file_num")
    public void setRepFileNum(String repFileNum) {
        this.repFileNum = repFileNum;
    }

    public Input3 withRepFileNum(String repFileNum) {
        this.repFileNum = repFileNum;
        return this;
    }

    @JsonProperty("CIK")
    public String getCik() {
        return cik;
    }

    @JsonProperty("CIK")
    public void setCik(String cik) {
        this.cik = cik;
    }

    public Input3 withCik(String cik) {
        this.cik = cik;
        return this;
    }

    @JsonProperty("entity_name")
    public String getEntityName() {
        return entityName;
    }

    @JsonProperty("entity_name")
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Input3 withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public Input3 withStreet1(String street1) {
        this.street1 = street1;
        return this;
    }

    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public Input3 withStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Input3 withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Input3 withStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Input3 withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @JsonProperty("filing_date")
    public String getFilingDate() {
        return filingDate;
    }

    @JsonProperty("filing_date")
    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate;
    }

    public Input3 withFilingDate(String filingDate) {
        this.filingDate = filingDate;
        return this;
    }

    @JsonProperty("doc_type_code ")
    public String getDocTypeCode() {
        return docTypeCode;
    }

    @JsonProperty("doc_type_code ")
    public void setDocTypeCode(String docTypeCode) {
        this.docTypeCode = docTypeCode;
    }

    public Input3 withDocTypeCode(String docTypeCode) {
        this.docTypeCode = docTypeCode;
        return this;
    }

    @JsonProperty("extra")
    public Integer getExtra() {
        return extra;
    }

    @JsonProperty("extra")
    public void setExtra(Integer extra) {
        this.extra = extra;
    }

    public Input3 withExtra(Integer extra) {
        this.extra = extra;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Input3 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Input3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("repFileNum");
        sb.append('=');
        sb.append(((this.repFileNum == null)?"<null>":this.repFileNum));
        sb.append(',');
        sb.append("cik");
        sb.append('=');
        sb.append(((this.cik == null)?"<null>":this.cik));
        sb.append(',');
        sb.append("entityName");
        sb.append('=');
        sb.append(((this.entityName == null)?"<null>":this.entityName));
        sb.append(',');
        sb.append("street1");
        sb.append('=');
        sb.append(((this.street1 == null)?"<null>":this.street1));
        sb.append(',');
        sb.append("street2");
        sb.append('=');
        sb.append(((this.street2 == null)?"<null>":this.street2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("filingDate");
        sb.append('=');
        sb.append(((this.filingDate == null)?"<null>":this.filingDate));
        sb.append(',');
        sb.append("docTypeCode");
        sb.append('=');
        sb.append(((this.docTypeCode == null)?"<null>":this.docTypeCode));
        sb.append(',');
        sb.append("extra");
        sb.append('=');
        sb.append(((this.extra == null)?"<null>":this.extra));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.cik == null)? 0 :this.cik.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.filingDate == null)? 0 :this.filingDate.hashCode()));
        result = ((result* 31)+((this.repFileNum == null)? 0 :this.repFileNum.hashCode()));
        result = ((result* 31)+((this.entityName == null)? 0 :this.entityName.hashCode()));
        result = ((result* 31)+((this.extra == null)? 0 :this.extra.hashCode()));
        result = ((result* 31)+((this.docTypeCode == null)? 0 :this.docTypeCode.hashCode()));
        result = ((result* 31)+((this.street1 == null)? 0 :this.street1 .hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.street2 == null)? 0 :this.street2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input3) == false) {
            return false;
        }
        Input3 rhs = ((Input3) other);
        return (((((((((((((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip)))&&((this.cik == rhs.cik)||((this.cik!= null)&&this.cik.equals(rhs.cik))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.filingDate == rhs.filingDate)||((this.filingDate!= null)&&this.filingDate.equals(rhs.filingDate))))&&((this.repFileNum == rhs.repFileNum)||((this.repFileNum!= null)&&this.repFileNum.equals(rhs.repFileNum))))&&((this.entityName == rhs.entityName)||((this.entityName!= null)&&this.entityName.equals(rhs.entityName))))&&((this.extra == rhs.extra)||((this.extra!= null)&&this.extra.equals(rhs.extra))))&&((this.docTypeCode == rhs.docTypeCode)||((this.docTypeCode!= null)&&this.docTypeCode.equals(rhs.docTypeCode))))&&((this.street1 == rhs.street1)||((this.street1 != null)&&this.street1 .equals(rhs.street1))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.street2 == rhs.street2)||((this.street2 != null)&&this.street2 .equals(rhs.street2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
