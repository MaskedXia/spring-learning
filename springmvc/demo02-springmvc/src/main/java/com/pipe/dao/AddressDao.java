package com.pipe.dao;

public class AddressDao {
    private String Province;
    private String city;

    @Override
    public String toString() {
        return "AddressDao{" +
                "Province='" + Province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
