package Lab1;

public class CommandLine {
	

	
		public static void main(String[] args) {
			int i;
			for(i=0;i<args.length;i++) {
				System.out.println((i+1)+"-argument: "+args[i]);
			}	
		}
	}
