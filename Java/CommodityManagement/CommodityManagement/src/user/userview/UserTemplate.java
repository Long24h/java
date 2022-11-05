package user.userview;

import user.User;
import user.usermanagement.UserManagement;
import view.ViewTemplate;

import java.util.ArrayList;

public abstract class UserTemplate extends ViewTemplate {
    protected UserManagement userManagement;
    protected UserTemplate(){
        userManagement = new UserManagement();
    }
    protected void showUser(ArrayList<User> usersList){
        for (User user : usersList) {
            System.out.println(user);
        }
    }
}
