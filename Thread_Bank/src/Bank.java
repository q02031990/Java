
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

	public synchronized boolean transfer(int i, double geldTransfer){
		if(i==0){
			//Auszahlung
			if(this.getKontostand()<geldTransfer){
				//System.out.println("nicht Auszahlung Konnen!!!");
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
