/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diarmuidbeirne.ct417assignment1;


import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 *
 * @author I342041
 */

public class Course {
    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName, LocalDate startDate, LocalDate endDate) {
        setCourseName(courseName);
        setStartDate(startDate);
        setEndDate(endDate);
        modules = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModuleList(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){

        this.students.add(student);
    }
}
