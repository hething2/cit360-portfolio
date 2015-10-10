import java.util.*;

public class CollectionList {
   public static void main(String args[]) {
   
	  ArrayList<String> lst = new ArrayList<String>();

	  /*Elements added to Array List*/
	  lst.add("mouse");
	  lst.add("Rat");
	  lst.add("Couch");
	  lst.add("Emu");
	  lst.add("Tyrannosaurus deer");

	  /* Displaying array list*/
	  System.out.println("Array:"+lst);

	  /*Add element at the given index*/
	  lst.add(0, "Rat");
	  lst.add(1, "mouse");

	  /*Remove elements from array list like this*/
	  lst.remove("Emu");
	  lst.remove("Tyrannosaurus deer");

	  System.out.println("Current array list is:"+lst);

	  /*Remove element from the given index*/
	  lst.remove(1);

	  System.out.println("Current array list is:"+lst);
   }
}