
/**
 * Write a description of class ScientificConsole here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScientificConsole extends BasicConsole
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ScientificConsole
     */
    public ScientificConsole()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void scientificMain(){
        double userNum1 = 0.0;
        double userNum2 = 0.0;
        double result = 0.0;
        boolean run = true;

        ScientificCalculator sc = new ScientificCalculator();
        ScientificConsole console = new ScientificConsole();
        String numPrompt = "Please enter a number";
        String prompt = "Please enter an operation? Choose one below. " +  "\n" + "(sin) (cos) (tan) (asin) (acos) (atan) (x!) (bin) (oct) (hex)";

        while(run){

            userNum1 = console.getDoubleInput(numPrompt);
            f.add(label);
            f.setVisible(true);
            String operator = console.getStringInput(prompt);

            if(operator.equals("sin") || operator.equals("cos") || operator.equals("tan") || operator.equals("asin") || operator.equals("acos")|| operator.equals("atan")) { 
                switch(operator){
                    case "sin": result = sc.sinRadFunc(userNum1);
                    break;
                    case "cos": result = sc.cosRadFunc(userNum1);
                    break;
                    case "tan": result = sc.tanRadFunc(userNum1);
                    break;
                    case "asin": result = sc.asinRadFunc(userNum1);
                    break;
                    case "acos": result = sc.acosRadFunc(userNum1);
                    break;
                    case "atan": result = sc.atanRadFunc(userNum1);
                    break;
                }
                String strResult = String.valueOf(result);
                console.printReturn(result);
                console.returnToMain();
            }else if(operator.equals("x!")){
                result = sc.calculateFactorial(userNum1);
                String strResult = String.valueOf(result);
                console.printReturn(result);
                console.returnToMain();
            }
            else if(operator.equals("bin") || operator.equals("hex") || operator.equals("oct")){
                switch (operator) {
                    case "sqrt": result = sc.squareRoot(userNum1);
                    break;
                    case "1/x": result = sc.calcInverse(userNum1);
                    break;
                    case "x^2": result = sc.square(userNum1);
                    break;
                    //case "-A": result = bc.square(userNum1);
                    //break;
                }
                String strResult = String.valueOf(result);
                console.printReturn(result);
                console.returnToMain();
            }
            else{
            console.println("Sorry one of your inputs was incorrect, try again.");
            }
        }
    }
}
