package javademosproject;

public class myfirstjavaprogram {
	myfirstjavaprogram(){
		System.out.println("constructor method");
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		myfirstjavaprogram my1 =new myfirstjavaprogram();
		myfirstjavaprogram my2=new myfirstjavaprogram();
		
	}

}
