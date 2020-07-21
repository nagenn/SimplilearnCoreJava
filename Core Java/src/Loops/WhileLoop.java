package Loops;

public class WhileLoop {
	static int i=0; //what happens if we change this to 11?
	public static void looper1() {		
	while (i<=10) {
		System.out.println("Counter:"+i);
		i++;
	}
	}
}
