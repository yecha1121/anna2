package steemit;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;

//이렇게 필드값과 함수를 콜 할수 있습니다.
public class ReflectionTest2 {
	public static void main(String[] args) throws Exception {
		
		Class steem = Class.forName("steemit.STEEM2");
		Object object = steem.newInstance();
		Field[] fields = steem.getDeclaredFields();
		Method[] methods = steem.getDeclaredMethods();
		
		Stream.of(fields).forEach( field -> {
			try {
				System.out.println(field.get(object));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		for(Method method: methods) {
			method.invoke(object, null);
		}
		
	}
}

class STEEM2{
	public String STEEMIT = "This is Steemit";
	public String STEEPSHOT = "This is steepshot";
	public String DTUBE = "This is DTUBE";
	
	public void upvote() {
		System.out.println("function upvote call");
	}
}