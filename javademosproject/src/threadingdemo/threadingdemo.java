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
		for(int i=0;i<100;i++) {
		System.out.println("hello from multiple thread\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
}
}
class singlethread {
	void print(){
		for(int i=0;i<100;i++) 
		{
		System.out.println("hello from single thread\n");
		
	}}
		
}