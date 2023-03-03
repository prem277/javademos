package threadingdemo;

public class threadingdemo {
	public static void main(String[] args) {
		multithread mt=new multithread();
		mt.start();
		singlethread st=new singlethread();
		st.print();
		
	}
}
class multithread extends Thread{
	public void run(){
		for(int i=0;i<10;i++) {
		System.out.println( Thread.currentThread().getName());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
}
}
class singlethread {
	void print(){
		for(int i=0;i<10;i++) 
		{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(20);
		}catch(Exception e) {
			System.out.println("exception from single thread\n");
		}
		
	}}
		
}