package Controller;
import Model.*;
import View.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.GUIView;
import lib.resualt;

public class GUIController implements ActionListener {

	private GUIView theView;
	private GUIModel theModel;
	//start form
	
	public GUIController(GUIView View, GUIModel Model ) {
		this.theView = View;
		this.theModel = Model;
		
		this.theView.DisplayResualt(new TinhtoanListener());
	}
	class TinhtoanListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			resualt resualt = null;
			try{
				resualt.setCurrent(Integer.parseInt(theView.get_Current()));
				resualt.setMeasure(theView.get_Measure());
				theModel.CalculatorPower(resualt.getVolt(), resualt.getCurrent());
				resualt.setPower(resualt.getPower());
			}catch(Exception ex){
				theView.DisplayError("error");
			}
		}
		
	}
	
	/*
	public GUIController() {
		super();
		JFrame frame = new JFrame();	
		frame.setSize(800, 600);
		
		View = new GUIView();
		
		frame.getContentPane().add(view);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}*/

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
