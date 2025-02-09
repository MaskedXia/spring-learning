package com.pipe.spring6.iocxml.dimap;

public class Lesson {
    private String lessName;

    public String getLessName() {
        return lessName;
    }

    public void setLessName(String lessName) {
        this.lessName = lessName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessName='" + lessName + '\'' +
                '}';
    }
}
