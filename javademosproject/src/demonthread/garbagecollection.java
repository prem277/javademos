package demonthread;

public class garbagecollection {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			new object(i);
		}
		System.gc();
	}
}
class object{
	int id;
	public object(int i) {
		this.id=i;
		System.out.println("created "+id);
	}
	protected void finalize()throws Throwable{
		System.out.println("destroyed "+id);
	}
}