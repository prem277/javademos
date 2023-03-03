package threaddemo1;

public class threaddemo2 {
	public static void main(String[] args) {
		Thread t1=new Thread(new oddnum());
		Thread t2=new Thread(new evennum());
		t1.setName("odds");
		t2.setName("even");
		t1.start();
		t2.start();
		
	}

}
class oddnum implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%2!=0)
				System.out.println(Thread.currentThread().getName()+"  "+i);				
		}
	}
	
}
class evennum implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+"  "+i);				
		}
	}
	
}

