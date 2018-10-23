package testPackage;

/*
CT417Assignment1 
Author: 15331436 | Diarmuid Beirne

23 Oct 2018
*/

import com.diarmuidbeirne.ct417assignment1.Course;
import com.diarmuidbeirne.ct417assignment1.Module;
import org.joda.time.LocalDate;

import java.util.ArrayList;

public class CourseTest {

    ArrayList<Module> moduleList = new ArrayList<>();
    LocalDate testStartDate = new LocalDate(2018,06,10);
    LocalDate testEndDate = new LocalDate(2019,01,01);
    private Course testCourse = new Course("Test Course", moduleList,testStartDate,testEndDate);
    public CourseTest() {}

}
