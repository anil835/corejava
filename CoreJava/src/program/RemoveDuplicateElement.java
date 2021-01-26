package program;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    list.add(40);
	    list.add(70);
	    list.add(30);
	    
	    TreeSet<Integer>set=new TreeSet<Integer>(list);
	    System.out.println(set);
	    System.out.println(set.descendingSet());

	}

}
