
public class ThreadMain {
	static public void main(String arg[]){
		Bank bank = new Bank(1000.0);
		String nameChild1 ="Quy";
		String nameChild2 ="Nghia";
		String nameChild3 ="Tung";
		
		String opa ="Ong Quynh";
		
		double kontostand = 0;
		
		int warteZeit =1000;
		GrandChild a1 = new GrandChild(bank,nameChild1,warteZeit);
		GrandChild a2 = new GrandChild(bank,nameChild2,warteZeit);
		GrandChild a3 = new GrandChild(bank,nameChild3,warteZeit);
		
		GrandFather b = new GrandFather(bank,opa,10);
		
		//System.out.println(bank.getKontostand());

		a1.start();
		a2.start();
		a3.start();
		
		kontostand = a1.getKontostand() + a2.getKontostand() + a3.getKontostand();
		
		
		b.start();
		b.setKontostand(kontostand);
		
		System.out.println("a1 : " + a1.getState()); // lấy trạng thái của thread 1
		
	}
}
