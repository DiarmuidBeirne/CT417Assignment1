/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;


import com.diarmuidbeirne.ct417assignment1.Student;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Test;


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
    
    
    
}
