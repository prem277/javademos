package arrayset;

import java.util.TreeSet;

public class arrayset {
	public static void main(String[] args) {
		TreeSet<Integer> x=new TreeSet<Integer>();
		x.add(10);
		x.add(40);
		x.add(30);
		for(int z:x)
			System.out.println(z);
		
	}
}
