

public class MainApplication {
    /**
     * An main method - the intialization of our inputs
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public static void main(String[] args) {
        
        String firstPrompt = "Would you like to use the 'Basic', 'Scientific', or 'Mystery' Calculator?";
        String basicPrompt = "You chose basic";
        String scientificPrompt = "You chose scientific";
        String mysteryPrompt = "You chose Mystery";
        String stringPrompt = "What would you like to add together?";
        
        BasicConsole bc = new BasicConsole();
        String userChoice = bc.getStringInput(firstPrompt);
        
        if(userChoice.equals("Basic")){
            
            bc.getStringInput(stringPrompt);
        }else if(userChoice.equals("Scientific")) {
            ScientificConsole sc = new ScientificConsole();
            sc.getStringInput(stringPrompt);
        }
        else{
            AnimalConsole ac = new AnimalConsole();
            ac.getStringInput(stringPrompt);
        }     
        
    }
}
