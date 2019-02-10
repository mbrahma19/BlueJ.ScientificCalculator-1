
public class BasicCalculator
{ 
    public BasicCalculator()
    {

    }

    public Double add(double inputOne, double inputTwo)
    {  
        return inputOne + inputTwo;
    }
    
    public Double subtract(double inputOne, double inputTwo) {
        return inputOne - inputTwo;
    }
    
    public Double multiply(double inputOne, double inputTwo){ 
        return inputOne * inputTwo;
    }
    
    public Double divide(double inputOne, double inputTwo){
        
        return inputOne / inputTwo;
    }
    
    public Double square(double inputOne) {
        double ans = Math.pow(inputOne,2);
        return ans;
    }
    
    public Double calcVariableExponentiation(double inputOne, double inputTwo) {
        double ans = Math.pow(inputOne, inputTwo);
        return ans;
    }
    
    public Double squareRoot(double inputOne) {
        double ans = Math.sqrt(inputOne);
        return ans;
    }
    
    public Double calcInverse(double inputOne) {
        double ans = 1/inputOne;
        return ans;
    }
    
    public Double convertInputPosNeg(double inputOne){
      double ans = inputOne * -1;
      
      return ans;
    }
}
