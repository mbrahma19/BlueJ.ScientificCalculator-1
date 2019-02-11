import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainApplication {
    /**
     * An main method - the intialization of our inputs
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public static void main(String[] args) {
        String firstPrompt = "Would you like to use the 'Basic', 'Scientific', or 'Mystery' Calculator?";
        Boolean run = true;
        BasicConsole bc = new BasicConsole();
        BasicConsole.f.add(bc.label);
        BasicConsole.f.setVisible(true);
        
        while(run){
            String userChoice = bc.getStringInput(firstPrompt);

            if(userChoice.equals("Basic")){
                bc.basicMain();
            }else if(userChoice.equals("Scientific")) {
                ScientificConsole sc = new ScientificConsole();
                sc.scientificMain();
            }
            else if(userChoice.equals("Mystery")){
                AnimalConsole ac = new AnimalConsole();
                ac.animalMain();
            }
            else{
                bc.println("Sorry incorrect input, try again.");
            }
        }
    }
}
