package minsub;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test02 {
	private double d;
	public static final int i = 37;
	String s = "testing";
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class cls = Class.forName("minsubTest02");
		Field fieldlist[] = cls.getDeclaredFields();
		for (int i = 0; i < fieldlist.length; i++) {
			Field fld = fieldlist[i];
			System.out.println("name ="+fld.getName() );
			System.out.println("decl class = "+fld.getDeclaringClass());
			System.out.println("type = "+ fld.getType());
			int mod = fld.getModifiers();
			System.out.println("modifiers = "+Modifier.toString(mod));
			System.out.println("--------------");
		}
	}
}
