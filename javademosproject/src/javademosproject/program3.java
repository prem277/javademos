package javademosproject;

public class program3 {
public static void main(String[] args) {
	int a=97; //primitive
	Integer b=new Integer(10);	//Integer class or wrapped class
	System.out.println((char)a );
	System.out.println(b);
	switch(a) {
	
	case 97:System.out.println("it is alphabet");
	break;
	case 64: System.out.println("it is character");
	break;
	default:System.out.println("invalid option");
	}
}
}
