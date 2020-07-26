package BasicOps;

public class TypeCastingExample {
	public static void main(String[] args)
	{
		/* Implicit typcasting */
		int i = 20;
		
		long l=i;
		
		float f =l;
		
		System.out.println("Integer:"+i);
		System.out.println("Long:"+l);
		System.out.println("Float:"+f);
		
		//Explicit typcasting
		double d = 20.99;
		f = (float) d;
		l = (long) f;
		i = (int) l;
		System.out.println("Double:"+d);
		System.out.println("Float:"+f);
		System.out.println("Long:"+l);
		System.out.println("Integer:"+i);
		
		
	}
}