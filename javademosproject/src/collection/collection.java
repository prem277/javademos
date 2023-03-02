package collection;
import java.util.ArrayList;
public class collection {
	public static void main(String[] args) {
		ArrayList<obj> x=new ArrayList<obj>();
		obj y=new obj(),p=new obj();
		x.add(y);
		x.add(p);
		for(obj z:x) {
			System.out.println(z.a+"\n"+z.b);
		}
	
	}
}
class obj{
	int a;
	String b;
	obj(){
	 a=10;
	 b="abcd";
	}
}
