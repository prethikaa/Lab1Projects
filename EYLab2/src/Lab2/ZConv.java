package Lab2;

public class ZConv {

	public static void main(String argv[]){   
		ZConv c=new ZConv();        
		String s=new String("ello");       
		c.amethod(s);    
		} 
	public void amethod(String s){   
		char c='H';     
		c+=s;     
		System.out.println(c);     
		}  
	} 
