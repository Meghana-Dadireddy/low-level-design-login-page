import repository.database;
import repository.inmemorydatabase;
import services.*;
public class Main {
    public static void main(String[] args){
        database db=new inmemorydatabase();
        authservice au=new classauthservices(db);
        au.register("meghana","password123","megha@gmail.com");
        au.register("yeshu","mypassword","yeshu@gmail.com");
        au.login("megha@gmail.com","password123");
        au.login("kh@gmail.com","mypassword");
        au.login("yeshu@gmail.com","wrong");
    }
}
