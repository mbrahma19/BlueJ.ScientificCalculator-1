
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest
{
    BasicCalculator testCalc = new BasicCalculator();
    
    @Test
    public void testAddDoubleMethod() {

        double testInputOne = 100.22;
        double testInputTwo = 200.33;
        double expected = 300.55;
        
        double actual = testCalc.add(testInputOne, testInputTwo);
        
        System.out.print("expected: " + expected + " actual: " + actual);
      
        assertEquals(expected, actual, 0.0001);
        
        
    }
    
    @Test
    public void testSubtractDoubleMethod(){
        double testInputOne = 700.66;
        double testInputTwo = 200.33;
        double expected = 500.33;
        
        double actual = testCalc.subtract(testInputOne, testInputTwo);
        
        System.out.print("expected: " + expected + " actual: " + actual);
      
        assertEquals(expected, actual, 0.0001);
        
    }
    
    @Test
    public void testMultiplyDoubleMethod() {
        double testInputOne = 700.66;
        double testInputTwo = 200.33;
        double expected = 140363.218;
        
        double actual = testCalc.multiply(testInputOne, testInputTwo);
        
        System.out.print("expected: " + expected + " actual: " + actual);
        
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testDivideDoubleMethod() {
        double testInputOne = 5.0;
        double testInputTwo = 4.0;
        double expected = 1.25;
        
        double actual = testCalc.divide(testInputOne, testInputTwo);
        
        System.out.print("expected: " + expected + " actual: " + actual);
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testSquareRootMethod() {
        double testInputOne = 49;
        double expected = 7;
        
        double actual = testCalc.squareRoot(testInputOne);
        
        System.out.print("expected: " + expected + " actual: " + actual);
        
        assertEquals(expected, actual, 0.001);
    }
}
