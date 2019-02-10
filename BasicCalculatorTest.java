
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
      
        assertEquals(expected, actual, 0.0001);
        
        
    }
    
    @Test
    public void testSubtractDoubleMethod(){
        double testInputOne = 700.66;
        double testInputTwo = 200.33;
        double expected = 500.33;
        
        double actual = testCalc.subtract(testInputOne, testInputTwo);
      
        assertEquals(expected, actual, 0.0001);
        
    }
    
    @Test
    public void testMultiplyDoubleMethod() {
        double testInputOne = 700.66;
        double testInputTwo = 200.33;
        double expected = 140363.218;
        
        double actual = testCalc.multiply(testInputOne, testInputTwo);
        
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testDivideDoubleMethod() {
        double testInputOne = 5.0;
        double testInputTwo = 4.0;
        double expected = 1.25;
        
        double actual = testCalc.divide(testInputOne, testInputTwo);
        System.out.println();
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testDivideByZero() {
        double testInputOne = 3;
        double testInputTwo = 0;
        double actual = testCalc.divide(testInputOne, testInputTwo);
        //System.out.println("divide by 0" + actual);
    }
    
    @Test
    public void testSquare() {
        double testInputOne = 3;
        double expected = 9;
        
        double actual = testCalc.square(testInputOne);
        
        assertEquals(expected,actual, 0.001);
        
    }
    
    @Test
    public void testCalcVariableExponentiation() {
        double testInputOne = 3;
        double testInputTwo = 4;
        double expected = 81;
        
        double actual = testCalc.calcVariableExponentiation(testInputOne, testInputTwo);
        
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testSquareRootMethod() {
        double testInputOne = 49;
        double expected = 7;
        
        double actual = testCalc.squareRoot(testInputOne);
        
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testCalcInverse() {

        double testInputOne = 2;
        double expected = 0.5;
        
        double actual = testCalc.calcInverse(testInputOne);

        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testConvertInputNeg() {
        
        double testInputOne = 2; 
        double expected = -2;
        
        double actual = testCalc.convertInputPosNeg(testInputOne);
        
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testConvertInputPositive() {
     double testInputOne = -2;
     double expected = 2;
     
     double actual = testCalc.convertInputPosNeg(testInputOne);
     
     assertEquals(expected, actual, 0.001);
    }
}