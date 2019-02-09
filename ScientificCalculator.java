
/**
 * Write a description of class ScientificCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScientificCalculator extends BasicCalculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ScientificCalculator
     */
    public ScientificCalculator()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y, int x)
    {
        
        return super.add(y,x);
    }
}
