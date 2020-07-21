package BasicOps;

public class AccessModifierExampleRun {
	public static void main(String[] args) {
		// create a new instance of ExampleA
		AccessModifierExampleA e1 = new AccessModifierExampleA();
		e1.pbl = 'x';
		System.out.println("The current value of pbl is:"+e1.pbl);
		e1.methodPublic(10);
		e1.methodProtected();
	}
}
