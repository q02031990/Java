package Model;

import lib.resualt;

public class GUIModel {
	
	private resualt resualt ;
	
	public void CalculatorPower(int volt, int current){
		resualt.setCurrent(current);
		resualt.setVolt(volt);
		resualt.setPower(volt * current);
	}
	
	public resualt getResualt(){
		return resualt;
	}
	
}
