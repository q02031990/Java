import java.util.Random;

public class GrandFather extends Thread {

	private Bank bank;
	private String nameChild;
	private int warteZeit;
	private double kontostand = 0;

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public boolean eingDouble(double n) {
		if (n > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void run() {
		super.run();
		while (!isInterrupted()) {
			Random rand = new Random();
			double n = rand.nextInt(100000);
			if (eingDouble(n)) {
				bank.transfer(1, n);
			}
			System.out.println("\n-------------Einzahlung---------------------\n");
			System.out.println(nameChild + " hat :" + n + " Euro eingezahlt\n");
			System.out.println("Konto :" + bank.getKontostand() + "\n");

			if (bank.Kontostand >= kontostand) {
				notify();
			}

			// Thread.sleep(warteZeit);
			Thread.yield();
		}

	}

	GrandFather(Bank bank, String nameChild, int warteZeit) {
		this.bank = bank;
		this.nameChild = nameChild;
		this.warteZeit = warteZeit;
	}
}
