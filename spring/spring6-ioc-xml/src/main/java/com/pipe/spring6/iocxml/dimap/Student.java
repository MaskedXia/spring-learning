package com.pipe.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {
    private String sname;
    private int sage;
    private Map<String, Teacher> teacherMap;
    private List<Lesson> lessonList;

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }



    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sage=" + sage +
                ", teacherMap=" + teacherMap +
                ", lessonList=" + lessonList +
                '}';
    }
}
