

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
        
        
    
    
}
