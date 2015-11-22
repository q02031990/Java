package Controller;

import javax.swing.JFrame;

import View.View;

public class Controller {

	//start form
	public Controller() {
		super();
		JFrame frame = new JFrame();	
		frame.setSize(800, 600);
		
		View view = new View();
		
		frame.getContentPane().add(view);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
