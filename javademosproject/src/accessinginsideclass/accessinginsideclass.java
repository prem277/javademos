package accessinginsideclass;

public class accessinginsideclass {
	public static void main(String[] args) {
		electronclass ec=new electronclass();
		electronclass.specs es=ec.new specs();
		es.specsname();
		
	}

}
class electronclass{
	static int x=10;
	String alpha="hello";
	static void power() {
		System.out.println("device power on");
		
	}
	static class chip{
		static void brandname() {
		System.out.println("current flow");
		}
	}
	class specs{
		void specsname() {
			System.out.println("specification of chip\n"+electronclass.x+"\n"+electronclass.this.alpha );
		}
	
	}
}