import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyReflector {
	public static void main(String[] args) throws Exception {
		Class myClass = Class.forName("MyClass");
		Constructor myConstructor = myClass.getConstructor(new Class[] {String.class});
		Object myObj = myConstructor.newInstance("kkkkk");
		Method method = myClass.getMethod("getMyName");
		String myName = (String) method.invoke(myObj);
		
		System.out.println("Myname is "+myName);
		
		
		Class[] methodParamClass = new Class[] { String.class };
		Object[] methodParamObject = new Object[] {"Kyungsu Kim"};
		Method method2 = myClass.getMethod("setMyName",methodParamClass);
		method2.invoke(myObj, methodParamObject);
		myName = (String)method.invoke(myObj);
 
		System.out.println("Changed myname is "+ myName);
 
		Class[] intParamClass = new Class[] {int.class, int.class};
		Object[] intParamObject = new Object[] {1, 2};
		Method method3 = myClass.getMethod("mySum",intParamClass);
		int sum = (int)method3.invoke(myObj,intParamObject);
 
		System.out.println("Sum is " + sum);
 
		Field field = myClass.getDeclaredField("myName");
		field.setAccessible(true);
		field.set(null,"No kaspy~!");
		String myName2 = (String)field.get(myObj);
		System.out.println("Myname2 is "+ myName2);

	}
}
