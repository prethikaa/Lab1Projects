package Lab1;
import java.util.ArrayList;
import java.util.List;
public class Location {
	 public static void main(String[] args) {
	      List aList = new ArrayList();
	      aList.add("A");
	      aList.add("B");
	      aList.add("C");
	      aList.add("D");
	      aList.add("E");
	      System.out.println("The index of element C in ArrayList is: " + aList.indexOf("C"));
	      System.out.println("The index of element F in ArrayList is: " + aList.indexOf("F"));
	   }
}
