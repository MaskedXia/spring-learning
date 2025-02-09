package com.pipe.mybatis.pojo;

public class Country {
    private String countryId;
    private String countryName;
    private String regionId;

    @Override
    public String toString() {
        return "CountryId{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionId='" + regionId + '\'' +
                '}';
    }

    public Country() {
    }

    public Country(String countryId, String countryName, String regionId) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.regionId = regionId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
}
