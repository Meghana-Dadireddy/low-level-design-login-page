package model;
public class user{
    private final String name;
    private final String hashedpassword;
    private final String email;
    public user(String name,String hashedpassword,String email){
        this.name=name;
        this.hashedpassword=hashedpassword;
        this.email=email;
    }
    public String getemail(){
        return email;
    }
    public String gethashedpassword(){
        return hashedpassword;
    }
    public String getname(){
        return name;
    }
}