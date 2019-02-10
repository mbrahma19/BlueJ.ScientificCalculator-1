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
    public void println(String val, Object... args) {
        out.format(val, args);
        out.println();
    }
    
    public String getStringInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextLine();
    }
    
    public void flush(){
        out.flush();
    }
    
    public void basicMain(){
        String prompt = git
    }
    

}
