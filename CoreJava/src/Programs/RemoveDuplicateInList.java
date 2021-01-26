package Programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateInList {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(50);
		
		TreeSet set=new TreeSet<>(list);
		System.out.println(set);
		System.out.println(set.descendingSet());
	}

	}


