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
        
        double radianX = Math.toRadians(inputDegrees);
        
        return radianX;
        
    }
    

    public double cosRadFunc(double r)
    {
        double cosRad = Math.cos(radianX);
        
        System.out.println(cosRad);
        
        return cosRad;
        
        }
    

    public double acosRadFunc(double r)
    {
        double coshRad = Math.cosh(radianX);
        
        System.out.println(coshRad);
        
        return coshRad;
        
        }
        
    public double tanRadFunc(double r)
    {
        double tanRad = Math.tan(radianX);
        
        System.out.println(tanRad);
        
        return tanRad;
        
        }

    public double tanhRadFunc(double r)
    {
        double tanhRad = Math.tanh(radianX);
        
        System.out.println(tanhRad);
        
        return tanhRad;
        
        }

    public double sinRadFunc(double r)
    {
        double sinRad = Math.sin(radianX);
        
        System.out.println(sinRad);
        
        return sinRad;
        
        }

    public double sinhRadFunc(double r)
    {
        double sinhRad = Math.sinh(radianX);
        
        System.out.println(sinhRad);
        
        return sinhRad;
        
        }
        
        public double cosDegFunc(double d)
    {
        double cosDeg = Math.toDegrees(d);
        
        System.out.println(cosDeg);
        
        return cosDeg;
        
        }
    

    public double acosDegFunc(double d)
    {
        double coshDeg = Math.toDegrees(d);
        
        System.out.println(coshDeg);
        
        return coshDeg;
        
        }
        
    public double tanDegFunc(double d)
    {
        double tanDeg = Math.toDegrees(d);
        
        System.out.println(tanDeg);
        
        return tanDeg;
        
        }

    public double tanhDegFunc(double d)
    {
        double tanhDeg = Math.tanh(d);
        
        System.out.println(tanhDeg);
        
        return tanhDeg;
        
        }

    public double sinDegFunc(double d)
    {
        double sinDeg = Math.sin(d);
        
        System.out.println(sinDeg);
        
        return sinDeg;
        
        }

    public double sinhDegFunc(double d)
    {
        double sinhDeg = Math.sinh(d);
        
        System.out.println(sinhDeg);
        
        return sinhDeg;
        
        }

}
