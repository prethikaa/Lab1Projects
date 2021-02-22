package Lab1;

public class Program17a {
	public static void main(String[] args) {
		final int val=10;
		val=20;
		/*
		 *This will cause compile time error.
		 *Error: The final local variable val cannot be assigned. It must be blank and not using a compound assignment
		 */
	}
} 
 class Program17b{
	 private static int aStaticVariable = 1;
		private void aNonStaticMethod() { 
			System.out.println(aStaticVariable); 
			}
		public static void main(String[] args) {
			Program17b obj=new Program17b();
			obj.aNonStaticMethod();
		}
 }
