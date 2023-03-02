package collection;
import java.util.ArrayList;
public class collection {
	public static void main(String[] args) {
		ArrayList<obj> x=new ArrayList<obj>();
		obj y=new obj();
		x.add(y);
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
