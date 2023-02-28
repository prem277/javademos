package javademosproject;

public class program5 {
	public static void main(String[] args) {
		sup sub1=new sub();
		sub1.start();
	}

}
class sup{
	void start() {
		System.out.println("super class");
		
	}
}
class sub extends sup{
	void start() {
		System.out.println("subclass overriding");
	}
}