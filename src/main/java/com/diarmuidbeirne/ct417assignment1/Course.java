/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diarmuidbeirne.ct417assignment1;


import org.joda.time.LocalDate;
import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 *
 * @author I342041
 */

public class Course {
    private String courseName;
    private ArrayList<Module> modules;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName, ArrayList<Module> modules, LocalDate startDate, LocalDate endDate) {
        setCourseName(courseName);
        setModules(modules);
        setStartDate(startDate);
        setEndDate(endDate);
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

    public void setModules(ArrayList<Module> modules) {
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
}