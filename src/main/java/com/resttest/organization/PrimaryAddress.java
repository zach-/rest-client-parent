package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class PrimaryAddress {
    @JsonProperty("PrimaryTownName")
    private String PrimaryTownName;
    @JsonProperty("CountryISOAlpha2Code")
    private String CountryISOAlpha2Code;
    @JsonProperty("CountryOfficialName")
    private String CountryOfficialName;
    @JsonProperty("TerritoryAbbreviatedName")
    private String TerritoryAbbreviatedName;

    public String getPrimaryTownName() {
        return PrimaryTownName;
    }

    public void setPrimaryTownName(String primaryTownName) {
        PrimaryTownName = primaryTownName;
    }

    public String getCountryISOAlpha2Code() {
        return CountryISOAlpha2Code;
    }

    public void setCountryISOAlpha2Code(String countryISOAlpha2Code) {
        CountryISOAlpha2Code = countryISOAlpha2Code;
    }

    public String getCountryOfficialName() {
        return CountryOfficialName;
    }

    public void setCountryOfficialName(String countryOfficialName) {
        CountryOfficialName = countryOfficialName;
    }

    public String getTerritoryAbbreviatedName() {
        return TerritoryAbbreviatedName;
    }

    public void setTerritoryAbbreviatedName(String territoryAbbreviatedName) {
        TerritoryAbbreviatedName = territoryAbbreviatedName;
    }
}
