package repository;
import model.user;
public interface database {
    boolean adduser(user userid);
    user getuser(String email);
}
