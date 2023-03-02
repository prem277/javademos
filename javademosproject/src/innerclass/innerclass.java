package innerclass;

public class innerclass {
		public static void main(String[] args) {
			electronclass ec=new electronclass();
			electronclass.chip ch=new 	electronclass.chip();
			electronclass.chip.brandname();
			ch.brandname();
			electronclass.specs ch1=ec.new specs();
			ch1.specsname();
			
			
 
		}

}
class electronclass{
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
			System.out.println("specification of chip");
		}
	
	}
}