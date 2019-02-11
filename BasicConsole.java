import java.io.Console;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
    public static JFrame f = new JFrame("Calculator");
    public static JLabel label= new JLabel("0");

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
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    public String getDisplay(){
        return label.getText();
    }

    public void clearDisplay(){
        label.setText("0");
    }

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
        double result = scanner.nextDouble();
        String strResult = String.valueOf(result);
        label.setText(strResult);
        return result;
    }

    public void printReturn(double result){
        if (Double.isInfinite(result) == true){
            this.println("Answer resulted in error, please try again");
        }
        else{
            String resultPrint = "Your answer is %s";
            String[] resultArr = {String.valueOf(result)};
            label.setText(String.valueOf(result));
            println(resultPrint, resultArr);
        }
    }

    public void returnToMain(){
        String end = this.getStringInput("Continue or Quit");
        if (end.equalsIgnoreCase("Quit")){
            this.println("Goodbye");
            System.exit(1);
        } else if (end.equalsIgnoreCase("Continue")){
            MainApplication.main(args);
        }
        else{
            this.println("Sorry incorrect input, try again");
            this.returnToMain();
        }

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
            f.add(label);
            f.setVisible(true);

            String operator = console.getStringInput(prompt);

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
                console.returnToMain();

            }else if(operator.equals("sqrt") || operator.equals("1/x") || operator.equals("x^2") || operator.equals("-A")){

                switch (operator) {
                    case "sqrt": result = bc.squareRoot(userNum1);
                    break;
                    case "1/x": result = bc.calcInverse(userNum1);
                    break;
                    case "x^2": result = bc.square(userNum1);
                    break;
                    case "-A": result = bc.convertInputPosNeg(userNum1);
                    break;
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
