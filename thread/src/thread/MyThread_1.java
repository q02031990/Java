package thread;

class MyThread_12 extends Thread

{
	int id;

	MyThread_12(int id) {
		this.id = id;
	}

	public void run()

	{
		int z;
		for (z = 0; z < 3; z++)
			//sleep(Math.round(1000.0 * Math.random()));
			System.out.println("MyThread_1 " + id + " cycle " + z);

	}

}

public class MyThread_1 {

	static public void main(String args[])

	{

		MyThread_12 t1, t2;

		t1 = new MyThread_12(1);

		t2 = new MyThread_12(2);

		t1.start();

		System.out.println("t1 " + t1.getState()); // lấy trạng thái của thread 1
		System.out.println("t2 " + t2.getState()); // lấy trạng thái của thread 2

		t2.start();
		System.out.println("t1 " + t1.getState());
		System.out.println("t2 " + t2.getState());
	}
}
