package Lab1;

public class Implicit {
	public static void main(String[] args) {
		char ch;
		int i=100;
		long l;
		float f;
		double d=100.46;
		
		System.out.println("Implicit conversion");
		f=i;
		d=f;
		System.out.println("int-"+i);
		System.out.println("float-"+f);	
		System.out.println("double-"+d);	
		System.out.println("EXplicit conversion");
		
         l=(long)d;
         ch=(char)f;
         System.out.println("long-"+l);
         System.out.println("char-"+ch);	
	}

}
