/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;


import com.diarmuidbeirne.ct417assignment1.Course;
import com.diarmuidbeirne.ct417assignment1.Module;
import com.diarmuidbeirne.ct417assignment1.Student;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;


/**
 *
 * @author I342041
 */

public class StudentTest {

    LocalDate testDOB1 = new LocalDate(1996, 12, 2);
    LocalDate testDOB2 = new LocalDate(1958, 02, 17);
    
    private Student testStudent1 = new Student("Eammonn", testDOB1, 12345);
    private Student testStudent2 = new Student("Alan", testDOB2, 54321);
    
    

    public StudentTest() {

        
    }
    @Test
    public void testStudentUsername() {
        
        
        String expectedStudentUsername = "Eammonn21";
        String actualStudentUsername = testStudent1.getUsername();
      
        
        String expectedStudentUsername2 = "Alan60";
        String actualStudentUsername2 = testStudent2.getUsername();
        
        
        assertEquals(expectedStudentUsername, actualStudentUsername);
        assertEquals(expectedStudentUsername2, actualStudentUsername2);
    }
    @Test
    public void testStudentDateOfBirth ()
    {
        LocalDate expectedDateOfBirth = new LocalDate(1996,12,2);
        LocalDate actualDateOfBirth = testStudent1.getDateOfBirth();

        assertEquals(expectedDateOfBirth, actualDateOfBirth);


    }
    @Test
    public void testID()
    {
        testStudent1.setStudentId(532523);
        int actualID = testStudent1.getStudentId();
        int expectedID = 532523;
        assertEquals(actualID, expectedID);

    }

    @Test
    public void testCourse()
    {
        ArrayList<Module> testModuleList = new ArrayList<>();

        LocalDate testStartDate = new LocalDate(2018,06,10);
        LocalDate testEndDate = new LocalDate(2019,01,01);
        Course testCourse = new Course("name", testModuleList,testStartDate,testEndDate);
        testStudent1.setEnrolledCourse(testCourse);
        Course expectedCourse = testCourse;
        Course actualCourse = testStudent1.getEnrolledCourse();
        assertEquals(expectedCourse, actualCourse);
    }

    @Test
    public void testModule()
    {
        Module testModule = new Module("testModule", 0001);
        ArrayList<Module> testModuleList = new ArrayList<>();
        testModuleList.add(testModule);

        testStudent1.addModule(testModule);

        ArrayList<Module> expectedResult = testModuleList;
        ArrayList<Module> actualResult = testStudent1.getModuleList();

        assertEquals(expectedResult, actualResult);


    }
    
    
}
