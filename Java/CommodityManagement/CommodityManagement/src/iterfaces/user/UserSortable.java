package iterfaces.user;

import iterfaces.Sortable;
import user.usermanagement.UserRole;

public interface UserSortable extends Sortable {
    void sortUserName(String username);
    void sortPassword(String password);
    void sortMoblie(int mobile);
    void sortEmail(String email);
    void sortAddress(String address);
    void sortUserRole(UserRole userRole);
}
