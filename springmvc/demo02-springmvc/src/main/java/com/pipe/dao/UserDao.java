package com.pipe.dao;

public class UserDao {
    private String username;
    private String age;
    private AddressDao addressDao;

    @Override
    public String toString() {
        return "UserDao{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", addressDao=" + addressDao +
                '}';
    }

    public AddressDao getAddressDao() {
        return addressDao;
    }

    public void setAddressDao(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
