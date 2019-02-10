

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
    ScientificCalculator sc = new ScientificCalculator();
    
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
    /*
    @Test
    public void addTest(){
        int y = 2;
        int x = 2;
        
        int expected = 4;
        int actual = new ScientificCalculator().sampleMethod(y,x);
    }*/
    
    @Test
    public void testConvertToBinary() {
        double testInput1 = 27;
        String expected = "11011";
        
        String actual = sc.convertToBinary(testInput1);
        System.out.println();

        assertEquals(expected, actual);
    }
    
    @Test
    public void testConvertToHex() {
        double testInput1 = 33;
        String expected = "21";
        
        String actual = sc.convertToHex(testInput1);
        System.out.println();

        assertEquals(expected, actual);
        
    }
    
    @Test
    public void testConvertToOctal() {
        double testInput1 = 76;
        String expected = "114";
        
        String actual = sc.convertToOctal(testInput1);
        System.out.println();

        assertEquals(expected, actual);
    }
    
    @Test
    public void testCalcFactorial() {
        double testInput1 = 4;
        double expected = 24;
        
        double actual = sc.calculateFactorial(testInput1);

        assertEquals(expected, actual, 0.0001);
        
    }
}
