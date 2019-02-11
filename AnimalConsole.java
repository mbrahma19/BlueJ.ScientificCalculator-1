
/**
 * Write a description of class AnimalConsole here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalConsole extends BasicConsole
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class AnimalConsole
     */
    public AnimalConsole()
    {
        // initialise instance variables
    }

    public void printReturn(double result, String operator){
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
    
    public void animalMain(){
        double userNum1 = 0.0;
        double result = 0.0;
        boolean run = true;

        AnimalCalculator ac = new AnimalCalculator();
        AnimalConsole console = new AnimalConsole();
        
        String prompt = ac.wild;
        String prompt2 = "Please select what animal you want your age converted to";
        String prompt3 = "(elephant) (fox) (hippo) (kangaroo) (lion) (wolf)";
        String numPrompt = ac.enter;
        
        console.println(prompt);
        while(run){
            console.println(prompt2);
            String operator = console.getStringInput(prompt3);
            userNum1 = console.getDoubleInput(numPrompt);

            if (operator.equals("elephant") || operator.equals("fox") || operator.equals("hippo") || operator.equals("kangaroo") || operator.equals("lion") || operator.equals("wolf")) { 
                switch (operator) {
                    case "elephant": result = ac.elephant(userNum1);
                    break;
                    case "fox": result = ac.fox(userNum1);
                    break;
                    case "hippo": result = ac.hippo(userNum1);
                    break;
                    case "kangaroo": result = ac.kangaroo(userNum1);
                    break;
                    case "lion": result = ac.lion(userNum1);
                    break;
                    case "wolf": result = ac.wolf(userNum1);
                    break;
                    
                }
                String strResult = String.valueOf(result);
                console.printReturn(result,operator);
                console.returnToMain();
            }else{
            console.println("Sorry one of your inputs was incorrect, try again.");
            }                   
        }
    }
    
}
