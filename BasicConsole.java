import java.io.Console;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
/**
 * Write a description of class BasicConsole here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasicConsole
{
    // instance variables - replace the example below with your own
    private final Scanner scanner;
    private final PrintStream out;
    public final String[] args = {""};

    /**
     * Constructor for objects of class BasicConsole
     */
    public BasicConsole()
    {
        // initialise instance variables
        this(System.in,System.out);
    }

    /**
     * Constructor for objects of class BasicConsole
     */
    public BasicConsole(Scanner scanner, PrintStream printStream)
    {
        // initialise instance variables
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * Constructor for objects of class BasicConsole
     */
    public BasicConsole(InputStream inputStream, OutputStream outputStream)
    {
        // 
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */

    public void print(String val, Object... args) {
        out.format(val, args);
    }

    public void println(String val, Object... args) {
        out.format(val, args);
        out.println();
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.next();
    }

    public Double getDoubleInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextDouble();
    }

    public void flush(){
        this.out.flush();
    }
    
    public void printReturn(double result){
        String resultPrint = "Your answer is %s";
        String[] resultArr = {String.valueOf(result)};
        println(resultPrint, resultArr);
    }

    public void basicMain(){
        double userNum1 = 0.0;
        double userNum2 = 0.0;
        double result = 0.0;
        boolean run = true;

        BasicCalculator bc = new BasicCalculator();
        BasicConsole console = new BasicConsole();
        String numPrompt = "Please enter a number";
        String prompt = "Please enter an operation? Choose one below. " +  "\n" + "( + ) ( - ) ( * ) ( / ) (x^y) ( x^2 ) (sqrt) (1/x) (-A)";
        String numPrompt2 = "Please enter a second number";
        
        while(run){
            
            userNum1 = console.getDoubleInput(numPrompt);
            //console.flush();
            String operator = console.getStringInput(prompt);
            //System.out.flush();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("x^y")) { 
                userNum2 = console.getDoubleInput(numPrompt2);
                switch (operator) {
                    case "+": result = bc.add(userNum1,userNum2);
                    break;
                    case "-": result = bc.subtract(userNum1,userNum2);
                    break;
                    case "*": result = bc.multiply(userNum1,userNum2);
                    break;
                    case "/": result = bc.divide(userNum1,userNum2);
                    break;
                    case "x^y": result = bc.calcVariableExponentiation(userNum1,userNum2);
                    break;

                }
                String strResult = String.valueOf(result);
                console.printReturn(result);
                
            }else{

                switch (operator) {
                    case "sqrt": result = bc.squareRoot(userNum1);
                    break;
                    case "1/x": result = bc.calcInverse(userNum1);
                    break;
                    case "x^2": result = bc.square(userNum1);
                    break;
                    //case "-A": result = bc.square(userNum1);
                    //break;
                }
                String strResult = String.valueOf(result);
                console.printReturn(result);
            }
            
            String end = console.getStringInput("Continue or Quit");
                   if (end.equalsIgnoreCase("Quit")){
                       console.println("Goodbye");
                       break;
                    }
                    
            MainApplication.main(args);
                    
        }
        //( sin ) ( cos ) ( tan ) ( asin ) ( acos ) ( atan ) ( sqrt ) ");
    }

}
