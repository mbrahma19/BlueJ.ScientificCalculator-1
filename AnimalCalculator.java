import java.lang.Math;
/**
 * Write a description of class AnimalCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalCalculator extends BasicCalculator
{
    // instance variables - replace the example below with your own
    private double age;
    private double elephant = 1.14;
    private double hippo = 1.78;
    private double lion = 2.29;
    private double wolf = 4.44; 
    private double fox = 5.71;
    private double kangaroo = 8.89;
    public String wild = "Are You Ready To Walk On The Wild Side?";
    public String enter = "Please Enter Your Age:";

    /**
     * Constructor for objects of class AnimalCalculator
     */
    public AnimalCalculator()
    { 

    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    // code for fox age method

    public double fox(double age){
        String foxPrompt = "This is your age in fox years";
        double result = Math.rint(age * fox);

        return result;
    }
    // code for hippo age method

    public double hippo(double age){
        String hippoPrompt = "This is your age in hippopotamus years";
        double result = Math.rint(age * hippo);
        
        return result;
    }
    // code for wolf age method

    public double wolf(double age){
        String wolfPrompt = "This is your age in wolf years";
        double result = Math.rint(age * wolf);

        return result;
    }
    // code for elephant age method

    public double elephant(double age){
        String elephantPrompt = "This is your age in elephant years";
        double result = Math.rint(age * elephant);

        return result;
    }
    // code for kangaroo age method

    public double kangaroo(double age){
        String kangarooPrompt = "This is your age in kangaroo years";
        double result = Math.rint(age * kangaroo);

        return result;
    }
    // code for lion age method

    public double lion(double age){
        String lionPrompt = "This is your age in lion years";
        double result = Math.rint(age * lion);

        return result;
    }
}


