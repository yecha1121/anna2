

import java.lang.reflect.Method;

public class DumpMethods {
	public static void main(String[] args) throws ClassNotFoundException {
//		Class c = Class.forName(args[0]);
//		Method[] methods = c.getDeclaredMethods();
//		for (int i = 0; i < methods.length; i++) {
//			System.out.println(methods[i].toString());
//		}
		
		Class c = Class.forName("java.lang.String");
		Method m[] = c.getDeclaredMethods();
		System.out.println(m[0].toString());
	}
}
