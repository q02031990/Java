package View;


import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIResualt extends Frame {
	
	
	public GUIResualt(){
		super();
	}

	private JLabel lb_Measure = new JLabel("Measure place");
	private JLabel lb_Current = new JLabel("Current");
	private JLabel lb_Voltage = new JLabel("Voltage");
	private JLabel lb_Power = new JLabel("Power");
	
	//private JLabel lb_MeasureR;
	private JLabel lb_CurrentR;
	private JLabel lb_VoltageR;
	private JLabel lb_PowerR;
	
	public void showResualt(){
		JPanel jp = new JPanel();
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,800);
		GridLayout gl = new GridLayout(0, 2);
		JLabel lb_MeasureR =  new JLabel("0193029039");
		
		jp.add(lb_Measure);
		jp.add(lb_MeasureR);/*
		jp.add(lb_Current);
		jp.add(lb_CurrentR);
		
		jp.add(lb_Voltage);
		jp.add(lb_VoltageR);
		jp.add(lb_Power);
		jp.add(lb_PowerR);
		*/
		
		jp.setLayout(gl);
		this.setVisible(true);
	}
}
