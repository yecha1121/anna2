import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Time {
	private static final String QuickTimeFormat = null;

	public static void main(String[] args) throws Exception {
		Class c = Class.forName(args[0]);
		Class[] classes = {args.getClass()};
		Method main = c.getMethod("main", classes);
		String nargs[] = new String[args.length-1];
		System.arraycopy(args, 1, nargs, 0, nargs.length);
		Object[] nargs1 = {nargs};
		
		System.out.println("Starting class"+c);
		long t0 = System.currentTimeMillis();
		main.invoke(null, nargs1);
		long t1 = System.currentTimeMillis();
		long runTime = t1 - t0;
		System.err.println("runTime: "+ QuickTimeFormat);
		
		
	}
}
