
public class Driver1 {

	public static void main(String[] args) {
		Mango.getClassName();
		Fruit.getClassName();
		
		Mango m = new Mango();
		Fruit f=m;
		m.getClassName();
		f.getClassName();
	}

}
