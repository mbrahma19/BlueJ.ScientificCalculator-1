import java.lang.Math;

public class ScientificCalculator extends BasicCalculator
{
    // instance variables - replace the example below with your own
    private double inputDegrees;
    double radianX;

    
    public ScientificCalculator()
    { 

        // initialise instance variables

    }

    public double degreesToRadians(double r){
        double normX = (r%360);
        double radianX = Math.toRadians(normX);

        return radianX;

    }


    public double cosRadFunc(double r)
    
    {
        double normX = (r%360);
        double radianX = Math.toRadians(normX);
        
        double cosRad = Math.cos(radianX);

        System.out.println(cosRad);

        return cosRad;

    }

    public double coshRadFunc(double r)
    {
        double normX = (r%360);
        double radianX = Math.toRadians(normX);
        
        double coshRad = Math.cos(radianX);

        System.out.println(coshRad);

        return coshRad;

    }

    public double tanRadFunc(double r)
    {
        double normX = (r%360);
        double radianX = Math.toRadians(normX);
        
        double tanRad = Math.tan(radianX);

        System.out.println(tanRad);

        return tanRad;

    }

    public double tanhRadFunc(double r)
    {
        double normX = (r%360);
        double radianX = Math.toRadians(normX);
        
        double tanhRad = Math.tanh(radianX);

        System.out.println(tanhRad);

        return tanhRad;
    }

    public double sinRadFunc(double r)
    {
        double normX = (r%360);
        double radianX = Math.toRadians(normX);
        
        double sinRad = Math.sin(radianX);

        System.out.println(sinRad);

        return sinRad;
    }

    public double sinhRadFunc(double r)
    {
        double normX = (r%360);
        double radianX = Math.toRadians(normX);
        
        double sinhRad = Math.sinh(radianX);

        System.out.println(sinhRad);

        return sinhRad;

    }

    public double cosDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);
        
        double cosDeg = Math.cos(radianX);

        System.out.println(cosDeg);

        return cosDeg;
    }

    public double coshDegFunc(double d)
    {
        double normX = (d%360);
        double radianX = Math.toRadians(normX);
        
        double coshDeg = Math.cosh(radianX);

        System.out.println(coshDeg);

        return coshDeg;
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
}