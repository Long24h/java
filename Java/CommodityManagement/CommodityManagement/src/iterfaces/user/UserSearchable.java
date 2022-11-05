package iterfaces.user;

import iterfaces.Searchable;
import user.User;
import user.usermanagement.UserRole;

import java.util.List;

public interface UserSearchable extends Searchable {
    User searchUserName(String userName);
    List searchPassword(String password);
    User searchMobile(int mobile);
    User searchEmail(String email);
    List searchAddress(String address);
    List searchUserRole(UserRole userRole);
}
