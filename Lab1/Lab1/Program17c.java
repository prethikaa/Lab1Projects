package Lab1;

class Program17c{
	 public static void main(String[] args) {
		 HelloWorldClass hw=new HelloWorldClass(0);
		 /*
		  *This will cause compile time error.
		  *Error: The constructor HelloWorldClass() is undefined
		  */
	}
}
class HelloWorldClass
{
	HelloWorldClass(int a)
	{
		System.out.println("Hello World With Args Constructor");
	}
} 
