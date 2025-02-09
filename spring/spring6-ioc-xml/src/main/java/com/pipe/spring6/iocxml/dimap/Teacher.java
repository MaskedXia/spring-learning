package com.pipe.spring6.iocxml.dimap;

public class Teacher {
    private String tname;
    private String tage;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTage() {
        return tage;
    }

    public void setTage(String tage) {
        this.tage = tage;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tname='" + tname + '\'' +
                ", tage='" + tage + '\'' +
                '}';
    }
}
