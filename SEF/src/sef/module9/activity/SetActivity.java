package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;

public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		HashSet<String> h = new HashSet<String>();
		h.add("Aligator");
		h.add("Dog");
		h.add("Horse");
		h.add("Turtle");
		h.add("Zebra");
		h.add("Turtle");

		//2 - Call print method to print the set passed as its parameter.
		System.out.println(h);

		//break
		System.out.println("********************");

		//3 - Type code to print this set
		Iterator<String>it = h.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
		//Notice the order in which elements get printed.
}
