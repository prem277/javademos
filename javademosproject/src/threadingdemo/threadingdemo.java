package threadingdemo;

public class threadingdemo {
	public static void main(String[] args) {
		singlethread st=new singlethread();
		st.print();
		multithread mt=new multithread();
		mt.start();
	}
}
class multithread extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		System.out.println("hello from multiple thread\n");	
	
	
}
}
class singlethread {
	void print(){
		for(int i=0;i<10;i++)
		System.out.println("hello from single thread\n");
	}
}