package javademosproject;

public class encapsulation {
	public static void main(String[] args) {
		encap encap1=new encap();
		System.out.println(encap1.geten1());
		System.out.println(encap1.geten2());
		encap1.seten1("hello");
		encap1.seten2(0);
		System.out.println(encap1.geten1());
		System.out.println(encap1.geten2());
	}
}
class encap{
	private String en1="hi";
	private int  en2=10;
	String geten1() {
		return en1;
	}
	int geten2() {
		return en2;
	}
	void seten1(String en1) {
		this.en1=en1;
	}
	void seten2(int en2) {
		this.en2=en2;
	}
			
}