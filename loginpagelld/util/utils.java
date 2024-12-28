package util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class utils {
    public static String hashpassword(String password){
        try{
            MessageDigest digest=MessageDigest.getInstance("SHA-256");
            byte[] hash=digest.digest(password.getBytes());
            StringBuilder sb=new StringBuilder();
            for(byte b:hash){
                String str=Integer.toHexString(0xff & b);
                if(str.length()==1) sb.append('0');
                sb.append(str);
            }
            return sb.toString();
        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException("Error hashing password");
        }
    }
    public static boolean isvalidemail(String email){
        return email.contains("@") && email.contains(".");
    }
}
