package javademosproject;

public class constructorchain {
public static void main(String[] args) {
	c2 C=new c2();
	c2 C2=new c2(10);
}
}
class c1{
	c1(){
		System.out.println("c1");
		
	}
	c1(int a){
		System.out.println("c1 with argument");
		
	}
}

class c2 extends c1{
	c2(){
		System.out.println("c2");
	}
	c2(int a){
		super(a);
	}
}