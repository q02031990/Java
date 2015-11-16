import java.util.ArrayList;

public class ThreadMain {
	static public void main(String arg[]){
		Bank bank = new Bank(1000.0);
		String nameChild1 ="Quy";
		String nameChild2 ="Nghia";
		String nameChild3 ="Tung";
		String opa ="Ong Quynh";
		
		int warteZeit =10;
		
		GrandChild a1 = new GrandChild(bank,nameChild1,warteZeit, 800);
		
		GrandChild a2 = new GrandChild(bank,nameChild2,warteZeit, 1);
	
		GrandChild a3 = new GrandChild(bank,nameChild3,warteZeit, 1000);
	
		
		ArrayList<GrandChild> kinder =  new ArrayList();
		kinder.add(a1);
		kinder.add(a2);
		kinder.add(a3);
		
		GrandFather b = new GrandFather(bank,opa,1000, kinder);

		a1.start();
		a2.start();
		a3.start();
		
		
		b.start();
		
		
		//System.out.println("a1 : " + a1.getState()); // lấy trạng thái của thread 1
		
	}
}
