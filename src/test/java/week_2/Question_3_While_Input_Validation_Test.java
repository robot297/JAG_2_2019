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


@RunWith(PowerMockRunner.class)
@PrepareForTest(InputUtils.class)

public class Question_3_While_Input_Validation_Test {
    
    @Test(timeout=3000)
    public void testGetCharacterInvalid() {
        
        mockStatic(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("")        // Enter something that's too short
                .andReturn("123456")  // Enter something that's too long
                .andReturn("ab")  // Enter something that's too long
                .andReturn("Q");      // Exactly 1 character
        replay(InputUtils.class);
        
        // TODO do thing
        
    }
    
    
    
}