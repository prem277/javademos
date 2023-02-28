package javademosproject;
import java.util.Scanner;
public class exceptiondemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value");
		
		int a=sc.nextInt();
		System.out.println("enter another value ");
		int b=sc.nextInt();
		try{
			int c=a%b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("invalid value");
		}
	}
}
