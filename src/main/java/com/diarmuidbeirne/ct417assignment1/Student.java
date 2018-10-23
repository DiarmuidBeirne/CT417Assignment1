/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diarmuidbeirne.ct417assignment1;

/**
 *
 * @author I342041
 */

import java.util.ArrayList;
import org.joda.time.DateTime;

import java.util.Calendar;
import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Student {
 
    private String fullName;
    private LocalDate dateOfBirth;
    private int age;
    private int studentId;
    ArrayList<Module> moduleList = new ArrayList();
    Course enrolledCourse;

    
    public Student(String name, LocalDate dateOfBirth, int studentId) {
        this.setFullName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setStudentId(studentId);
        this.setAge(Years.yearsBetween(dateOfBirth, LocalDate.now()).getYears());
        this.moduleList = new ArrayList<>(); //creates an empty moduleList
    }

    public String getUsername() {
        return fullName + Integer.toString(age);
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public ArrayList<Module> getModuleList() {
        return moduleList;
    }

    public void addModule(Module newModule) {moduleList.add(newModule);}

    public void setModuleList(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(Course enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }


}
