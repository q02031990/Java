
public class ThreadMain {
	static public void main(String arg[]){
		Bank bank = new Bank(1000.0);
		String nameChild1 ="Quy";
		String nameChild2 ="Nghia";
		String nameChild3 ="Tung";
		String opa ="Ong Quynh";
		
		int warteZeit =10;
		
		GrandChild a1 = new GrandChild(bank,nameChild1,warteZeit);
		GrandChild a2 = new GrandChild(bank,nameChild2,warteZeit);
		GrandChild a3 = new GrandChild(bank,nameChild3,warteZeit);
		
		GrandFather b = new GrandFather(bank,opa,warteZeit);

		a1.start();
	
		
		b.start();
		
		
		//System.out.println("a1 : " + a1.getState()); // lấy trạng thái của thread 1
		
	}
}
