package week_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Question_3_DebuggerTest {

    Question_3_Debugger q11;

    @Before
    public void setUp() {
        q11 = new Question_3_Debugger();
    }
    
     @Test(timeout=3000)
    public void testCanAddAndRemoveBreakPoint() throws Exception {
        assertTrue(q11.canAddAndRemoveBreakPoint());
    }

     @Test(timeout=3000)
    public void testCanStartDebugger() throws Exception {
        assertTrue(q11.canStartDebugger());
    }

     @Test(timeout=3000)
    public void testCanAddManyBreakpoints() throws Exception {
        assertTrue(q11.canAddManyBreakpoints());
    }

     @Test(timeout=3000)
    public void testCanStepThroughCode() throws Exception {
        assertTrue(q11.canStepThroughCode());
    }

     @Test(timeout=3000)
    public void testCanSeeValueOfVariables() throws Exception {
        assertTrue(q11.canSeeValueOfVariables());
    }

     @Test(timeout=3000)
    public void testCanSeeValuesOfVariablesInStructures() throws Exception {
        assertTrue(q11.canSeeValuesOfVariablesInStructures());
    }
}