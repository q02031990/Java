import java.util.Random;

public class GrandChild extends Thread {
	private Bank bank;
	private String nameChild;
	private int warteZeit;
	private double kontostand =0;
	
	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public void run(){
		super.run();
		try{
			while(!isInterrupted()){
				Random rand = new Random();
				double n = rand.nextInt(1000);
				//cong don cac lan rut vao de roi rut 1 the;
				kontostand = n; 
				System.out.println(nameChild + " mochte :" + n +" Euro auszahlen\n");
				if(bank.transfer(0, kontostand)){;
				//auszahlung
					System.out.println("\n-------------Auszahlung---------------------\n");
					System.out.println(nameChild + " hat :" + n +" Euro ausgezahlt\n");
					System.out.println("Konto :" + bank.getKontostand() +"\n");
				}else{
					//Thread.sleep(warteZeit*100); // cho ong chuyen khoan vao
					System.out.println("Konto: " + bank.getKontostand() +" -> kann nicht auszahlen");
					synchronized (bank) {
						//su dung phuong phap dong bo tren 2 tieng trinh trong 1 obj(bank)
						//Chi cho 1 tien trinh duoc lam viec tren obj Obj
						bank.wait();
					}
				}
				Thread.yield();
			}
		}catch(InterruptedException ex){
			
		}
	}
	
	GrandChild(Bank bank, String nameChild, int warteZeit){
		this.bank = bank;
		this.nameChild = nameChild;
		this.warteZeit = warteZeit;
	}
}


