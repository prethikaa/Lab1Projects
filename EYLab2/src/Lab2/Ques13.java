package Lab2;

public class Ques13 {
	public static void main(String[] args) {
		
	
	int i=9;
	switch(i) {
	default:
		System.out.println("default");
	
	case 0:
	System.out.println("zero");
	break;
	case 1:
	System.out.println("one");
	case 2:
	System.out.println("two");
	
	}	
}
}

//// as there is not break in case 1 & 2 the successive cases are also executed
