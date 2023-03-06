package demonthread;
public class demonthread {
	public static void main(String[] args) {
		Thread t1=new Thread(new demon());
		System.out.println(""+Thread.currentThread().isDaemon());
		t1.start();
		System.out.println(""+Thread.currentThread().isDaemon());
		System.out.println(""+t1.isDaemon());

		
		
	}
}
class demon implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName()+"\n");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}