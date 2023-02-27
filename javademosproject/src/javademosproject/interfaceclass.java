package javademosproject;

public class interfaceclass {
public static void main(String[] args) {
	abc1 a1 =new abc1();
	a1.func();
	a1.func2();
}
}
interface abc{
	void func();
	void func2();
	
}
class abc1 implements abc{
	public void func() {
		System.out.println("fun function implemented ");
		
	}
	public void func2() {
		System.out.print("fun2 function implemented");
	}
}