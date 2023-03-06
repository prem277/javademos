package predicate12;

import java.util.function.Predicate;

public class predicate12{
	public static void main(String[] args) {
		Predicate<Integer> p1=(i)->(i >20);
		int[] num= {1,2,3,4,5,6,7,8,9};
		System.out.println(""+p1.test(10)+"\n"+p1.test(20)+"\n"+p1.test(21));
		//other ex
		Predicate<Integer> p2=(i)->(i%2==0);
		fun(p2,num);
	}
	public static void fun(Predicate<Integer> pf,int[] num) {
		for(int i:num) {
			if(pf.test(i)) {
				System.out.println("even number is "+i+" in given array");
			}
		}
		
	}

}
