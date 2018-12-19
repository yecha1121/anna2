import java.lang.reflect.Field;

public class Reflection01 {
    public static void main(String[] args) throws Throwable {
        CustInfo ci = new CustInfo();
        
        System.out.println("before : "+ci);
        
        CommonUtil.encryptVO(ci);   // automatic encrypt.
        
        System.out.println("after : "+ci);
    }
}

class CommonUtil{
    
    private static String[] encryptWords = new String[]{
        "rrno","addr"   
    };
    
    public static void encryptVO(Object vo) throws Throwable{
        Field[] fields = vo.getClass().getDeclaredFields();
        for(Field field : fields ){
            for( String word : encryptWords){
                if( field.getName().indexOf(word) > -1 ){                   
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
        return "CustInfo [name=" + name + ", rnno=" + rrno + ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3="
                + addr3 + "]";
    }
}

class SecurityUtil{
    public static String encrypt(String data){
        return data+":encrypt";
    }
    public static String decrypt(String data){      
        return data+":decrypt";
    }
}