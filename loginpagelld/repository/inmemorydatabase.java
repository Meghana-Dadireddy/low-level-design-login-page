package repository;
import model.user;
import java.util.*;
public class inmemorydatabase implements database {
    private final Map<String,user> map=new HashMap<>();
    public boolean adduser(user userid){
        if(map.containsKey(userid.getemail())){
            return false;
        }
        map.put(userid.getemail(),userid);
        return true;
    }
    public user getuser(String email){
        return map.get(email);
    }

}
