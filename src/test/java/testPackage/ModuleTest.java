package testPackage;

import com.diarmuidbeirne.ct417assignment1.Module;
import org.junit.Before;
import org.junit.Test;

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

     

}