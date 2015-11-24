package lib;

public class resualt {
	public resualt() {
		super();
		this.measure = "";
		this.Current = 0;
		this.Volt = 0;
		this.power = 0;
	}
	
	public resualt(String measure, int current, int volt, int power) {
		super();
		this.measure = measure;
		this.Current = current;
		this.Volt = volt;
		this.power = power;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public int getCurrent() {
		return Current;
	}
	public void setCurrent(int current) {
		Current = current;
	}
	public int getVolt() {
		return Volt;
	}
	public void setVolt(int volt) {
		Volt = volt;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	private String measure;
	private int Current;
	private int Volt;
	private int power;
	
}
