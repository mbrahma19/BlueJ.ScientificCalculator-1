import java.lang.Math;

public class ScientificCalculator extends BasicCalculator
{
    // instance variables - replace the example below with your own
    private double degX;
    double radianX;

    public ScientificCalculator()
    { 

        // initialise instance variables

    }

    public double degreesToRadians(double r)
    {
        double degX = (r%360);
        
        double radianX = Math.toRadians(degX);

        return radianX;
    }

    public double cosRadFunc(double r)
    {

        double radianX =this.degreesToRadians(r); 
   
        double cosRad = Math.cos(radianX);


        return cosRad;

    }

    public double acosRadFunc(double r)
    {
        double radianX =this.degreesToRadians(r); 
        
        double acosRad = Math.acos(radianX);

        return acosRad;

    }

    public double tanRadFunc(double r)
    {       
        double radianX =this.degreesToRadians(r);
        
        double tanRad = Math.tan(radianX);

        return tanRad;

    }

    public double atanRadFunc(double r)
    {       
        double radianX =this.degreesToRadians(r); 
        
        double atanRad = Math.atan(radianX);

        return atanRad;
    }

    public double sinRadFunc(double r)
    {
        double radianX =this.degreesToRadians(r); 
        
        double sinRad = Math.sin(radianX);

        return sinRad;
    }

    public double asinRadFunc(double r)
    { 
        
        double asinRad = Math.asin(radianX);

        double sinhRad = Math.sinh(radianX);

        System.out.println(sinhRad);

        return sinhRad;

    }
/**
    public double cosDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);

        double cosDeg = Math.cos(radianX);

        return cosDeg;
    }


    public double coshDegFunc(double d)
    {
        double normX = (d%360);
        
        double radianX = Math.toRadians(normX);

        double coshDeg = Math.cosh(radianX);

        return asinRad;
    }

    

    public double tanDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);

        double tanDeg = Math.tan(radianX);

        System.out.println(tanDeg);

        return tanDeg;
    }

    public double tanhDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);

        double tanhDeg = Math.tanh(radianX);

        System.out.println(tanhDeg);

        return tanhDeg;
    }

    public double sinDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);

        double sinDeg = Math.cos(radianX);

        System.out.println(sinDeg);

        return sinDeg;

    }

    public double sinhDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);

        double sinhDeg = Math.cos(radianX);

        System.out.println(sinhDeg);

        return sinhDeg;

    }
*/

    public String convertToBinary(double input1) {
        int myInt = (int)Math.round(input1);
        String ans = Integer.toBinaryString(myInt);
        return ans;
    }

    public String convertToHex(double input1) {
        int myInt = (int)Math.round(input1);
        String ans = Integer.toHexString(myInt);
        return ans;
    }

    public String convertToOctal(double input1) {
        int myInt = (int)Math.round(input1);
        String ans = Integer.toOctalString(myInt);
        return ans;
    }

    public double calculateFactorial(double input) {
        double ans = 1;
        for(double i = 2; i <= input; i++) {
            ans *=i;   
        }
        return ans;
    }

}   