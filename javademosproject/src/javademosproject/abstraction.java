package javademosproject;

public class abstraction {
public static void main(String[] args) {
	ab1 AB1 = new ab1();
	AB1.fun();
}
}
abstract class ab{
	abstract void fun();
}

class ab1 extends ab{
	
void fun() {
	System.out.println("this is abstract");
}
}