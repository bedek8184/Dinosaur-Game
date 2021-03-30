import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables
  // main panel to store everything
  JPanel mainPanel;
  // components
  JButton startOrStop;
  JLabel instructionsLabel;

  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Dinosaur Game");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 500 pixels tall
    frame.setSize(800,500);
    // shows the window
    frame.setVisible(true);

    // create main panel to add components
    mainPanel = new JPanel();
    // get rid of the layout manager
    mainPanel.setLayout(null);

    // create the instruction label
    instructionsLabel = new JLabel ("Press Space to jump and Q to add cactus");
    instructionsLabel.setBounds(50, 390, 500, 45);
    
    // add components to the main panel
    mainPanel.add(instructionsLabel);
    // add panel to the frame
    frame.add(mainPanel);
 
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}


