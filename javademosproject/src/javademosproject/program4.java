package javademosproject;

public class program4 {
	public static void main(String[] args) {
		car1 c1=new car1(1,2,3,4);
		car1 c2=new car1(1,2);
	}

}
class vehicle12{
	int a,b;
	vehicle12(int a ,int b){
		this.a=a;
		this.b=b;
	}
}

class car1 extends vehicle12{
	int c,d;
	car1(int a,int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	car1(int a,int b){
		super(a,b);
	}
}