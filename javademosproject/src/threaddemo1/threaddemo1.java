package threaddemo1;

import java.util.Scanner;

public class threaddemo1 {
	public static void main(String[] args) {
		System.out.println("sum of sequence number\n"+"enter number");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		calculator c=new calculator(n);
		c.start();
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printmess("sum of numbers--"+c.getsum());
	}
	public static void printmess(String mess) {
		System.out.println(Thread.currentThread().getName()+"--"+mess);
	}

}
class calculator extends Thread{
	int n;
	int sum=0;
	calculator(int n){
		this.n=n;
	}
	public void run(){
		for(int i=1;i<=n;i++) {
			sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	int getsum() {
		return sum;
	}
	
}