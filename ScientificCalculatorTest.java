

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ScientificCalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ScientificCalculatorTest
{
    /**
     * Default constructor for test class ScientificCalculatorTest
     */
    public ScientificCalculatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void addTest(){
        int y = 2;
        int x = 2;
        
        int expected = 4;
        int actual = new ScientificCalculator().sampleMethod(y,x);
    }
}
