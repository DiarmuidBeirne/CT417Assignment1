package testPackage;

import com.diarmuidbeirne.ct417assignment1.Course;
import com.diarmuidbeirne.ct417assignment1.Module;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModuleTest {

    Module testModule = new Module("Test Module", 001);
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getModuleName() throws Exception {
        String expectedResult = "Test Module";
        String actualResult = testModule.getModuleName();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void setModuleName() throws Exception {

        testModule.setModuleName("Test Module2");
        String expectedResult = "Test Module2";
        String actualResutlt = testModule.getModuleName();
    }

    @Test
    public void getModuleId() throws Exception {
        int expectedResult = 001;
        int actualResult = testModule.getModuleId();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void setModuleId() throws Exception {
        testModule.setModuleId(002);
        int expectedResult = 002;
        int actualResult = testModule.getModuleId();
    }

    @Test
    public void addCourse() throws Exception {
        org.joda.time.LocalDate testStartDate = new org.joda.time.LocalDate(2018,06,10);
        org.joda.time.LocalDate testEndDate = new org.joda.time.LocalDate(2019,01,01);
        Course testCourse = new Course("testCourse", testStartDate,testEndDate);
        testModule.addCourse(testCourse);
        ArrayList<Course> expectedResult = new ArrayList<>();
        expectedResult.add(testCourse);
        ArrayList<Course> actualResult = testModule.getCourses();

        assertEquals(expectedResult,actualResult);

    }



}