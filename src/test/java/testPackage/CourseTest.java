package testPackage;

/*
CT417Assignment1 
Author: 15331436 | Diarmuid Beirne

23 Oct 2018
*/

import com.diarmuidbeirne.ct417assignment1.Course;
import com.diarmuidbeirne.ct417assignment1.Module;
import com.diarmuidbeirne.ct417assignment1.Student;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CourseTest {


    LocalDate testStartDate = new LocalDate(2018,06,10);
    LocalDate testEndDate = new LocalDate(2019,01,01);
    private Course testCourse = new Course("Test Course", testStartDate,testEndDate);

    public CourseTest() {}



    @Test
    public void testCourseName()
    {
       String expectedResult = "Test Course";
       String actualResult = testCourse.getCourseName();
       assertEquals(expectedResult, actualResult);
    }

    @Test
    public void  testCourseModules()
    {
        Module testModule = new Module("Test Module", 001);
        ArrayList<Module> testModuleList = new ArrayList<>();
        testModuleList.add(testModule);
        testCourse.setModuleList(testModuleList);

        assertEquals(testModuleList, testCourse.getModules());

    }

    @Test
    public void testStudent()
    {
        Student testStudent = new Student("Diarmuid Beirne", new LocalDate(1996,12,2), 532);
        testCourse.addStudent(testStudent);
        ArrayList<Student> testStudentList = new ArrayList<>();
        testStudentList.add(testStudent);
        ArrayList<Student> expectedResult = testStudentList;
        ArrayList<Student> actualResult = testCourse.getStudents();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testDates(){

        LocalDate testStartDate = new LocalDate(2018, 9, 01);
        LocalDate testEndDate = new LocalDate(2019, 01,01);

        testCourse.setStartDate(testStartDate);
        testCourse.setEndDate(testEndDate);

        LocalDate expectedResult = testStartDate;
        LocalDate actualResult = testCourse.getStartDate();

        assertEquals(expectedResult, actualResult);

        expectedResult = testEndDate;
        actualResult = testCourse.getEndDate();

        assertEquals(expectedResult, actualResult);

    }
}

