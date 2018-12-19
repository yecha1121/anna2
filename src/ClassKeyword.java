import java.util.Calendar;

public class ClassKeyword {
	public static void main(String[] args) {
		System.out.println("Trying the ClassName.class keyword");
		System.out.println();
		System.out.println("Object class	: "+ Object.class);
		System.out.println("String class 	: "+ String.class);
		System.out.println("Calendar Class 	: "+ Calendar.class);
		System.out.println("Current class 	: "+ ClassKeyword.class);
		System.out.println();
		
		System.out.println("Trying the instance.getClass() method");
		System.out.println("Robin the Fearless".getClass());
		System.out.println(Calendar.getInstance().getClass());
	}
}
