package services;

public interface authservice {
    //services package to deal with registering and login deatils
    boolean register(String email,String password,String name);
    boolean login(String email,String password);
}
