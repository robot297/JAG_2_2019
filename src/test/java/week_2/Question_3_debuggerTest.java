package week_2;

import junit.framework.TestCase;
import org.junit.Test;

public class Question_3_debuggerTest extends TestCase {

    Question_3_debugger q11;

    public void setUp() {
        q11 = new Question_3_debugger();
    }
    
    @Test
    public void testCanAddAndRemoveBreakPoint() throws Exception {
        assertTrue(q11.canAddAndRemoveBreakPoint());
    }

    @Test
    public void testCanStartDebugger() throws Exception {
        assertTrue(q11.canStartDebugger());
    }

    @Test
    public void testCanAddManyBreakpoints() throws Exception {
        assertTrue(q11.canAddManyBreakpoints());
    }

    @Test
    public void testCanStepThroughCode() throws Exception {
        assertTrue(q11.canStepThroughCode());
    }

    @Test
    public void testCanSeeValueOfVariables() throws Exception {
        assertTrue(q11.canSeeValueOfVariables());
    }

    @Test
    public void testCanSeeValuesOfVariablesInStructures() throws Exception {
        assertTrue(q11.canSeeValuesOfVariablesInStructures());
    }
}