package _07_drum_kit;

import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit {

	private DrumKitController controller;
	private JFrame frame;
	private JPanel panel;
	private JLabel drum;
	private JLabel cymbal;

	DrumKit() {
			
		// 1. Complete the code in the makeFrame() method 
		makeFrame();

		// 2. Complete the code in the DrumKitController class
		controller = new DrumKitController();

		// 3. Complete the code in the addImages() method 
		addImages();
	}


	private void makeFrame() {

		/* The View first consists of just 2 Components: a frame and a panel */
		
		//    Initialize the frame variable to  "new JFrame()"

		//    Make the frame visible
	
		//    Set the frame's default close operation to JFrame.EXIT_ON_CLOSE

		//    Set the title of the frame

		//    Initialize the panel variable  "new JPanel()"

		//    Add the panel to the frame

		//    Set a grid layout on the panel (use the code below)
		//      panel.setLayout(new GridLayout());

	}
	
	private void addImages() {
    	
    	/* This method will add 2 images (labels) to the View. One is for a drum and the other for a cymbal */
    	
		// Initialize the drum JLabel using the makeLabelFromIcon method below
			//       	- You will need to get the drum icon from the controller to do this
		
		//    Add the drum JLabel to the panel
	
		//    Call the pack() method on the frame. 
		
		/*   Run the program. 
		*       Do you see the frame? Do you see the drum image on it?
		*/
	
	
		//    Now add a MouseListener to the drum JLabel (hint: the controller is a MouseListener) 
	
						
		/*    Run the program again and click on the drum. Do you hear a drum sound?
		*       If you did not, make sure you completed all the code in the DrumKitController class
		*/


		//    Repeat the above steps to add a cymbal picture to the drum kit  

	}
	
	private JLabel makeLabelFromIcon (Icon icon) {
		return new JLabel(icon);
	}


	
}