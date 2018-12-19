import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyReflector2 {
	public static void main(String[] args) throws Exception {
		
		Class myClass = Class.forName("MyClass");
		Method methods[] = myClass.getDeclaredMethods();
		System.out.println("1.DeclareMethods() ==============");
		
		for (Method method : methods) {
			System.out.println("Found method name: "+method);
		}
		
		System.out.println();
		
		Method methods2[] = myClass.getMethods();
		System.out.println("2.getMethods()=====================");
		for (Method method : methods2) {
			System.out.println("Found method name : "+method);
		}
		System.out.println();
		Field fields[] = myClass.getFields();
		System.out.println("3.getFields======================");
		for (Field field : fields) {
			System.out.println("Found field name : "+ field);
		}
		System.out.println();
		Constructor myConstructor = myClass.getConstructor(new Class[] {String.class});
		Method hiddenMethod = myClass.getDeclaredMethod("hiddenMethod");
		System.out.println("5.================================");
		System.out.println("hidden method name is "+hiddenMethod.getName());
		
		
		
	}
}
