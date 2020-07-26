package BasicOps;

public class AccessModifierExampleRun {
	public static void main(String[] args) {
		/*note - you can call a static method
		 * instantiating a new object for that class
		 */
		System.out.println("Current value of stat is:"+AccessModifierExampleA.stat);
		AccessModifierExampleA.methodStatic();
		
		// create a new instance of ExampleA
		AccessModifierExampleA e1 = new AccessModifierExampleA();
		e1.pbl = 'x';
		
		/*e1.lang="python"; 
		 What happens if I uncomment the above line?
		 */
		System.out.println("The current value of pbl is:"+e1.pbl);
		e1.methodPublic(10);
		e1.methodProtected();
	}
}
