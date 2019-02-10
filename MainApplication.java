

public class MainApplication {
    /**
     * An main method - the intialization of our inputs
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public static void main(String[] args) {
        
        String firstPrompt = "Would you like to use the 'Basic', 'Scientific', or 'Mystery' Calculator?";

        BasicConsole bc = new BasicConsole();
        String userChoice = bc.getStringInput(firstPrompt);
        
        if(userChoice.equals("Basic")){
            bc.basicMain();
        }else if(userChoice.equals("Scientific")) {
            ScientificConsole sc = new ScientificConsole();
            //sc.scienticMain();
        }
        else{
            AnimalConsole ac = new AnimalConsole();
            ac.animalMain();
        }     
        
    }
}
