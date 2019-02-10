

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * The test class AnimalCalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AnimalCalculatorTest
{ AnimalCalculator animalCalc = new AnimalCalculator();
    
    @Test
    public void testFoxDoubleMethod() {
        
        double testAge = 25;
        
        double expected = 143;
        
        double actual = animalCalc.fox(testAge);
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testElephantDoubleMethod() {
        
        double testAge = 75.6;
        
        double expected = 86;
        
        double actual = animalCalc.elephant(testAge);
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testHippoDoubleMethod() {
        
        double testAge = 89;
        
        double expected = 158;
        
        double actual = animalCalc.hippo(testAge);
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testLionDoubleMethod() {
        
        double testAge = 3000;
        
        double expected = 6870;
        
        double actual = animalCalc.lion(testAge);
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testWolfDoubleMethod() {
        
        double testAge = 3278.249;
        
        double expected = 14555;
        
        double actual = animalCalc.wolf(testAge);
        
        assertEquals(expected, actual, 0.001);
        
    }
    
    @Test
    public void testKangarooDoubleMethod() {
        
        double testAge = 233333;
        
        double expected = 2074330;
        
        double actual = animalCalc.kangaroo(testAge);
        
        assertEquals(expected, actual, 0.001);
        
    }
        
        
    
    
}
