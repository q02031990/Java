// Bank class
public class Bank {
	public Bank(double kontostand) {
		super();
		Kontostand = kontostand;
	}

	double Kontostand;
	
	public double getKontostand() {
		return Kontostand;
	}

	public void setKontostand(double kontostand) {
		Kontostand = kontostand;
	}

	synchronized public boolean transfer(int i, double geldTransfer){
		if(i==0){
			//Auszahlung
			if(this.getKontostand()<geldTransfer){
				return false;
			}else{
				this.setKontostand(this.Kontostand - geldTransfer);
			}
		}else{
			//Einzahlung
			this.setKontostand(this.Kontostand + geldTransfer);
		}
		return true;
	}
}
