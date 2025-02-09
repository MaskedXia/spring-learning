package com.pipe.spring6.iocxml.life;

public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("2 set username value");
        this.username = username;
    }

    public User(){
        System.out.println("1 no para User Constructor");
    }

    public User(String username){
        System.out.println("2 with para User Constructor");
        this.username = username;
    }

    public void init()
    {
        System.out.println("4 init");
    }

    public void destroy()
    {
        System.out.println("7 destroy");
    }



}
