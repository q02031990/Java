package thread;

class thread1 extends Thread{
	int id;
	
	thread1(int id){
		this.id = id;
	}
	
	public void run(){
		int z;
		for(z=0;z<3;z++){
			System.out.println("thread1 :" + id + " \nCycle :" + z);
			System.out.println("----------------------------------------------------");
		}
	}
}

public class qThread {
	static public void main(String arg[]){
		thread1 t1  = new thread1(1);
		thread1 t2  = new thread1(2);
		
		t1.start();
		t2.start();
		
	}
}
