package javademosproject;

public class program2 {
	int dem3;
	
	public static void main(String[] args) {
		bike b1 =new bike();
		audi a1=new audi();
		System.out .println(a1.fuel());
	}

}
class vehicle{
	vehicle(){
		System.out.println("vehicle");
	}
	

}
class bike extends vehicle{
	bike(){
		System.out.println("bike");
	}
}

class audi extends car{
	int fuel() {
		return 1;
	}
	
}
