

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
    
    @Test
    public void testdegreesToRadians(){
        double r = 90;
        double expect = 1.5708;
        
        double actual = sc.degreesToRadians(r);
        
        assertEquals(expect, actual, 0.0001);
    }
    
    @Test
    public void testcosRadFunc(){
        double r = 120;
        double expect = -0.5;
        
        double actual = sc.cosRadFunc(r);
        
        assertEquals(expect, actual, 0.0001);
    }
    
    @Test
    public void testacosRadFunc(){
        double r = 1;
        double expect = 1.553342440621;
        
        double actual = sc.acosRadFunc(r);
        
        assertEquals(expect, actual, 0.0001);
    }
    
    @Test
    public void testtanRadFunc(){
        double r = 50;
        double expect = 1.19175359259421;
        
        double actual = sc.tanRadFunc(r);
        
        assertEquals(expect, actual, 0.0001);
    }
    
    @Test
    public void testatanRadFunc(){
        double r = 75;
        double expect = 0.91843192411957;
        
        double actual = sc.atanRadFunc(r);
        
        assertEquals(expect, actual, 0.0001);
    }
    
    @Test
    public void testsinRadFunc(){
        double r = 90;
        double expect = 1;
        
        double actual = sc.sinRadFunc(r);
        
        assertEquals(expect, actual, 0.0001);
    }
    
    
    
 
    @Test
    public void testConvertToBinary() {
        double testInput1 = 27;
        String expected = "11011";
        
        String actual = sc.convertToBinary(testInput1);
        

        assertEquals(expected, actual);
    }
    
    @Test
    public void testConvertToHex() {
        double testInput1 = 33;
        String expected = "21";
        
        String actual = sc.convertToHex(testInput1);
        

        assertEquals(expected, actual);
        
    }
    
    @Test
    public void testConvertToOctal() {
        double testInput1 = 76;
        String expected = "114";
        
        String actual = sc.convertToOctal(testInput1);
        

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
