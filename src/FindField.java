import java.lang.reflect.Field;
import java.util.Calendar;

public class FindField {
	public static void main(String[] args) throws Exception {
		FindField gf = new FindField();
		Object o = new YearHolder();
		System.out.println("The value of 'currentYear' is: "+ gf.intFieldValue(0,"currentYear"));
	}
	int intFieldValue(Object o, String name) throws Exception {
		Class c = o.getClass();
		Field fld = c.getField(name);
		int value = fld.getInt(o);
		return value;
		
	}
	
}
class YearHolder {
	public int currentYear = Calendar.getInstance().get(Calendar.YEAR);
}