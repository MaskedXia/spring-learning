package com.pipe.spring6.iocxml.dimap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student2 {
    private int[] arrays;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    public Student2() {
    }

    public int[] getArrays() {
        return arrays;
    }

    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "arrays=" + arrays +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
