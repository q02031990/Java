import java.util.Random;

public class GrandFather extends Thread {

	private Bank bank;
	private String nameChild;
	private double kontostand = 0;
	private int wartezeit;
	
	private double gelAuszahlung  = 0.0;

	public double getGelAuszahlung() {
		return gelAuszahlung;
	}

	public void setGelAuszahlung(double gelAuszahlung) {
		this.gelAuszahlung = gelAuszahlung;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public boolean eingDouble(double n) {
		if (n >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public void run() {
		try{
		super.run();
		while (!isInterrupted()) {
			Random rand = new Random();
			double n = rand.nextInt(1000);
			// einzahlung
			if (bank.transfer(1, n)) {
				System.out.println("\n-------------Einzahlung---------------------\n");
				System.out.println(nameChild + " hat :" + n + " Euro eingezahlt ->");
				System.out.println("Konto :" + bank.getKontostand() + "\n");
				Thread.sleep(wartezeit);
			}
			if (bank.Kontostand >= 1000) {
				synchronized (bank) {
					bank.notify();
					//notify();
				}
				Thread.yield();
			}

			// Thread.sleep(warteZeit);
		}
		}catch(Exception e){
			System.out.println("error" + e);
		}

	}

	GrandFather(Bank bank, String nameChild, int warteZeit) {
		this.bank = bank;
		this.nameChild = nameChild;
		this.wartezeit = warteZeit;
	}
}
