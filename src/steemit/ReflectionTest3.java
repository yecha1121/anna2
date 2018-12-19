package steemit;

import java.lang.reflect.Field;

public class ReflectionTest3 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		CustInfo ci = new CustInfo();
		System.out.println("bofore : "+ ci);
		CommonUtil.encryptionVO(ci);
		System.out.println("after : "+ ci);
	}
}

class CommonUtil{
	private static String[] encrypWords = new String[] {
			"rrno", "addr"
	};
	
	public static void encryptionVO(Object vo) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = vo.getClass().getDeclaredFields();
		for (Field field : fields) {
			for (String word : encrypWords) {
				if(field.getName().indexOf(word)> -1) {
					field.set(vo, SecurityUtil.encrypt(field.get(vo).toString()));
				}
			}
		}
	}
}

class CustInfo{
	public String name = "test";
	public String rrno = "711111-1111117";
	public String addr1 = "seoul";
	public String addr2 = "busan";
	public String addr3 = "jeju";
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CustInfo [name="+name+", rrno="+rrno+", addr1="+addr1+", addr2="+addr2+", addr3="+addr3+"]";
	}
}

class SecurityUtil{
	public static String encrypt(String data) {
		return data+":encrypt";
	}
	public static String decrypt(String data) {
		return data+":decrypt";
	}
}