package hashset;

import java.util.HashSet;
import java.util.Set;

public class hashset {
	public static void main(String[] args) {
		Set<Integer> x1=new HashSet<Integer>();
		x1.add(20);
		x1.add(10);
		x1.add(30);
		x1.add(60);
		x1.add(80);
		x1.add(40);

		for(Integer q:x1) {
			System.out.println(q);
			}
	}

}
