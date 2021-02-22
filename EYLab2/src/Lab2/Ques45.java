package Lab2;



public class Ques45{
public static void main(String argv[]){
	Ques45 r = new Ques45();
r.amethod(r);
}
public void amethod(Ques45 r){
int i=99;
multi(r);
System.out.println(i);
}
public void multi(Ques45 r){
//r.i = r.i*2; // 'i' is a varibale created inside a method so throws error at compile time 
}
}