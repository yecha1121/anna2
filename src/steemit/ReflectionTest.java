package steemit;

import java.lang.reflect.*;
import java.util.stream.Stream;

//�̷��� �ʵ���� �޼ҵ����� �˼� �ִ�.
public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Class steem = Class.forName("steemit.STEEM");
		Field[] fields = steem.getDeclaredFields();
		Method[] methods = steem.getDeclaredMethods();
		
		Stream.of(fields).forEach(field -> {
			System.out.println(field.getName());
		});
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}

class STEEM{
	public String STEEMIT = "This is Steemit.";
	public String STEEPSHOT = "This is steepshot";
	public String DTUBE = "This is DTUBE";
	
	public void upvote() {
		System.out.println("upvote");
	}
}
