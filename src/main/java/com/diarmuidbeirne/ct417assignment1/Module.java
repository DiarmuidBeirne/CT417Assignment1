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

    public Module(String moduleName, int moduleId, ArrayList<Student> students) {
        setModuleName(moduleName);
        setModuleId(moduleId);
        setStudents(students);
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


}
