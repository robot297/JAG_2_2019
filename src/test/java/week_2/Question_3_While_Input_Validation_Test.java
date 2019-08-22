package week_2;

import input.InputUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.TestCase.assertEquals;
import static org.easymock.EasyMock.anyString;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.easymock.PowerMock.*;
import static week_2.Question_3_While_Input_Validation.getCollegeClassCode;


@RunWith(PowerMockRunner.class)
@PrepareForTest(InputUtils.class)
public class Question_3_While_Input_Validation_Test {
    
    @Test(timeout=3000)
    public void testGetCodeRejectNumbersTooHigh() {
        
        mockStatic(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(3010)
                .andReturn(123456)
                .andReturn(3000)
                .andReturn(9999)
                .andReturn(2454);  // Valid
        replay(InputUtils.class);
        
        int code = getCollegeClassCode();
        assertEquals("The getCollegeClassCode should reject input numbers greater than 2999", 2454, code);
        
    }
    
    @Test(timeout=3000)
    public void testGetCodeRejectNumbersTooLow() {
        
        mockStatic(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(0)
                .andReturn(-1123456)
                .andReturn(999)
                .andReturn(43)
                .andReturn(2417);  // Valid
        replay(InputUtils.class);
        
        int code = getCollegeClassCode();
        assertEquals("The getCollegeClassCode method should reject input numbers smaller than 1000", 2417, code);
        
    }
    
    @Test(timeout=3000)
    public void testGetCodeAcceptValidNumbers() {
        
        mockStatic(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(2417)
                .andReturn(2950)
                .andReturn(1310);
        replay(InputUtils.class);
        
        int code1 = getCollegeClassCode();
        assertEquals("The getCollegeClassCode method should accept input numbers 2417 first time", 2417, code1);
    
        int code2 = getCollegeClassCode();
        assertEquals("The getCollegeClassCode method should accept input numbers 2950 first time", 2950, code2);
    
        int code3 = getCollegeClassCode();
        assertEquals("The getCollegeClassCode method should accept input numbers 1310 first time", 1310, code3);
    
    }
    
    
}