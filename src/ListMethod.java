import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListMethod {
	public static void main(String[] args) throws ClassNotFoundException {
		if(args.length == 0) {
			System.err.println("Usage: ListMethods class Name");
			return;
		}
		Class c = Class.forName(args[0]);
		Constructor[] cons = c.getConstructors();
		printList("Constructors",cons);
		Method[] meths = c.getMethods();
		printList("Methods",meths);
	}

	private static void printList(String s, Object[] o) {
		// TODO Auto-generated method stub
		System.out.println("***" + s + "***");
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i].toString());
		}
	}
}
