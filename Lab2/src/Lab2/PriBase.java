package Lab2;

class Base1{ // Compile time error if we declare as private
Base1(){
int i = 100;
System.out.println(i);
}
}
public class PriBase extends Base1{
static int i = 200;
public static void main(String argv[]){
	PriBase p = new PriBase();
System.out.println(i);
}
}