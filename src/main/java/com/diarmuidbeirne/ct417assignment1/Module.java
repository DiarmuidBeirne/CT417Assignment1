/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diarmuidbeirne.ct417assignment1;

import java.util.ArrayList;
/**
 *
 * @author I342041
 */


public class Module {
    private String moduleName;
    private int moduleId;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;




    public Module(String moduleName, int moduleId) {
        setModuleName(moduleName);
        setModuleId(moduleId);
        students = new ArrayList<Student>();
        courses = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {

        this.courses.add(course);
    }

    //adds a new student to the student ArrayList
    public void addStudent(Student newStudent) {
        this.students.add(newStudent);

    }


}
