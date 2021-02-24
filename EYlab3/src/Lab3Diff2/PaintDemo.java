package Lab3Diff2;

public class PaintDemo {
	public static void main(String[] args)throws Exception {
		PaintBrush brush=Container.getBrush(args[0]);
		brush.doPaint();		
	} 	
}
//the job of the container is to bring loose coupling
//this creates new objects dynamically and inject the dependancies and return the fully
//created objects
class Container{
	public static PaintBrush getBrush(String paintClass) throws Exception{
		PaintBrush brush=new PaintBrush();
		Paint paint=(Paint)Class.forName(paintClass).newInstance();
		//dependency injection
		brush.paint=paint;
		return brush;
	}
}
//The paintbrush code is open for modification...
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("Red colour...");
		}
		else if(i==2) {
			System.out.println("blue colour...");
		}
	}
}