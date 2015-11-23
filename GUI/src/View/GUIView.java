package View;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


public class GUIView extends JComponent  {
	/*
	 * Khai bao cac thanh phan tren form
	 * 
	 */
	private GridLayout gl = new GridLayout(0, 2);
	
	private JLabel lb_Measure = new JLabel("Measure place");
	private JLabel lb_Current = new JLabel("Current");
	private JLabel lb_Voltage = new JLabel("Voltage");
	private JLabel lb_Power = new JLabel("Power");
	private JLabel lb_Zahl = new JLabel("7000.0 quy");
	
	private JScrollPane scroll = new JScrollPane();
	
	private JTextField txt = new JTextField("70");
	
	private JPanel panel_Voltage_Group = new JPanel();
	//JRadioButtonMenuItem RadioButtonMenuItem = new JRadioButtonMenuItem();
	private ButtonGroup btu_Group = new ButtonGroup();
	
	
	private JRadioButton v1 = new JRadioButton("50V");
	private JRadioButton v2 = new JRadioButton("100V");
	private JRadioButton v3 = new JRadioButton("150V");
	
	private JButton btu = new JButton("Calculate");
	
	/*
	 * Constructor cua view
	 */
	public GUIView() {
		super();
		
		JPanel jp = new JPanel();
		this.setDebugGraphicsOptions(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,800);
		
		// hang 1
		jp.add(lb_Measure);
		String s[] = {"Vorwärmen","Ofen1","Ofen2","Brennen"};
		JList<String> list = new JList<String>(s);
		scroll.setViewportView(list);
		jp.add(scroll);
		
		jp.add(lb_Current);
		jp.add(txt);
		
		
		jp.add(lb_Voltage);
		panel_Voltage_Group.add(v1);
		panel_Voltage_Group.add(v2);
		panel_Voltage_Group.add(v3);
		
		btu_Group.add(v1);
		btu_Group.add(v2);
		btu_Group.add(v3);
				
		jp.add(panel_Voltage_Group);
		
		
		jp.add(lb_Power);
		jp.add(lb_Zahl);
		
		jp.add(btu);
		
		jp.setLayout(gl);
	}
	
	public String get_Measure(){
		return lb_Measure.getText();
	}
	
	public String get_Current(){
		return txt.getText();
	}
	
	public String get_Volt(){
		if(v1.isSelected()){
			return "50";
		}else if(v2.isSelected()){
			return "100";
		}
		return "150";
	}
	
	public void TinhToan(ActionListener listenAction){
		btu.addActionListener(listenAction);
	}
	
	public void DisplayError(String error){
		JOptionPane.showMessageDialog(this, error);
	}
	
}
