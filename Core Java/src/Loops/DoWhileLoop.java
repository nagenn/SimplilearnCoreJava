package Loops;

public class DoWhileLoop {
	
		static int i=0; //what happens if we change this to 11?
		public static void looper2() {		
		do {
			System.out.println("Counter:"+i);
			i++;
		}
		while (i<=10);
		
	}
}
