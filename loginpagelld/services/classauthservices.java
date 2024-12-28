package services;
import model.user;
import repository.database;
import util.utils;
public class classauthservices implements authservice {
    private final database db;
    public classauthservices(database db){
        this.db=db;
    }
    public boolean register(String name,String password,String email){
        if(!utils.isvalidemail(email) || password.length()<6){
            System.out.println("Invalid email or password too short");
            return false;
        }
        String hashedpassword=utils.hashpassword(password);
        user userid=new user(name,hashedpassword,email);
        if(!db.adduser(userid)){
            System.out.println("Email already exists...");
            return false;
        }
        System.out.println("Registration is successfull..");
        return true;
    }
    public boolean login(String email,String password){
        user userid=db.getuser(email);
        if(userid==null){
            System.out.println("Invalid email or password");
            return false;
        }
        String hashedpassword=utils.hashpassword(password);
        if(!hashedpassword.equals(userid.gethashedpassword())){
            System.out.println("Invalid email or password");
            return false;
        }
        System.out.println("Login Successfull. Welcome, "+userid.getname());
        return true;
    }
}
