package View;
import javax.swing.*;
import java.awt.*;


public class View extends JComponent  {
	/*
	 * Khai bao cac thanh phan tren form
	 * 
	 */
	GridLayout gl = new GridLayout(0, 2);
	
	JLabel lb_Measure = new JLabel("Measure place");
	JLabel lb_Current = new JLabel("Current");
	JLabel lb_Voltage = new JLabel("Voltage");
	JLabel lb_Power = new JLabel("Power");
	JLabel lb_Zahl = new JLabel("7000.0 quy");
	
	JScrollPane scroll = new JScrollPane();
	
	JTextField txt = new JTextField("70");
	
	JPanel panel_Voltage_Group = new JPanel();
	//JRadioButtonMenuItem RadioButtonMenuItem = new JRadioButtonMenuItem();
	ButtonGroup btu_Group = new ButtonGroup();
	
	
	JRadioButton v1 = new JRadioButton("50V");
	JRadioButton v2 = new JRadioButton("100V");
	JRadioButton v3 = new JRadioButton("150V");
	
	JButton btu = new JButton("Calculate");
	
	/*
	 * Constructor cua view
	 */
	public View() {
		super();
	/*	gl.setHgap(20);
		gl.setVgap(2);*/
		
		// hang 1
		this.add(lb_Measure);
		String s[] = {"Vorwärmen","Ofen1","Ofen2","Brennen"};
		JList<String> list = new JList<String>(s);
		scroll.setViewportView(list);
		this.add(scroll);
		
		this.add(lb_Current);
		this.add(txt);
		
		
		this.add(lb_Voltage);
		panel_Voltage_Group.add(v1);
		panel_Voltage_Group.add(v2);
		panel_Voltage_Group.add(v3);
		
		btu_Group.add(v1);
		btu_Group.add(v2);
		btu_Group.add(v3);
				
		this.add(panel_Voltage_Group);
		
		
		this.add(lb_Power);
		this.add(lb_Zahl);
		
		this.add(btu);
		
		this.setLayout(gl);
	}
	
			
	
}
