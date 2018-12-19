import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyJava {
	public static void main(String[] args) throws Exception {
//		MyClass myClass = new MyClass("kaspyx");
//		String myName = myClass.getMyName();
//		System.out.println("My name is "+myName);
		
		
		//reflection 
		Class myClass = Class.forName("Yeni");
		Constructor myConstrutor = myClass.getConstructor(new Class[] {String.class});
		Object myobj = myConstrutor.newInstance("kaspyx");
		Method method = myClass.getMethod("getMyNa");
		String myName = (String) method.invoke(myobj);
		
		System.out.println("Myname is "+myName);
		
		
	}
}
