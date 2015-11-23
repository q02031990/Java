package Controller;
import Model.*;
import View.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.GUIView;

public class GUIController implements ActionListener {

	private GUIView View;
	private GUIModel Model;
	//start form
	
	public GUIController(GUIView View, GUIModel Model ) {
		this.View = View;
		this.Model = Model;
		
		this.View.TinhToan(new TinhtoanListener());
		
		
	}
	class TinhtoanListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			String i,j;
			try{
				i = View.get_Measure();
				j = View.get_Current();
				Model.ab(j, j);
			}catch(Exception ex){
				View.DisplayError("error");
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
