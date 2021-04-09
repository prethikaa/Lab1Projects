package Lab2;

public class Ques59 {


	class BaseClassOver{
		private void amethod(int iBase){
		System.out.println("Base.amethod");
		}
		}
		class Ques59 extends BaseClassOver{
		public static void main(String argv[]){
			Ques59 o = new Ques59();
		int iBase=0;
		o.amethod(iBase);
		}
		public void amethod(int iOver){
		System.out.println("Over.amethod"); // prints this line Over.amethod as object of Program59_Over is created and is used
		}
