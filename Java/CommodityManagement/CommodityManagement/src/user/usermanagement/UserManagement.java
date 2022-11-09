package user.usermanagement;

import iterfaces.user.UserSearchable;
import product.Product;
import user.User;

import java.util.*;

import static user.usermanagement.UserRole.ADMIN;
import static user.usermanagement.UserRole.USER;

public class UserManagement {
    public UserManagement() {

    }

    protected Scanner scanner = new Scanner(System.in);
    protected static List<User> userList = new ArrayList<>();

    static {
        Date dateCreate = new Date();
        Date dateUpdate = new Date();

        userList.add(new User("moto710", "12345678", "Thien Nguyen", 9364758, "bui@bnui", "Hue", ADMIN));
        userList.add(new User("erihgm", "jtyvbrek", "Leesin", 46862, "leesin@bnui", "HN", ADMIN));
        userList.add(new User("Graves", "4836jng3", "Nguyen Van Graves", 43782653, "vanGraves@bnui", "SG", USER));
        userList.add(new User("Lucian", "46jwe4w4", "Lucian Pr0 Vjp", 235634, "LuKute@bnui", "VN", USER));
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        UserManagement.userList = userList;
    }
    public void addUser(User user){
        userList.add(user);
    }
    public void removeUser(int id){
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.remove(i);
                break;
            }
        }
    }

    public void editUser(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                System.out.println("Edit this user:");
                System.out.println("Enter new user's user name:");
                userList.get(i).setUserName(scanner.nextLine());

                System.out.println("Enter new user's password:");
                userList.get(i).setPassWord(scanner.nextLine());

                System.out.println("Enter new user's full name:");
                userList.get(i).setFullName(scanner.nextLine());

                System.out.println("Enter new user's mobile:");
                userList.get(i).setMobile(Integer.parseInt(scanner.nextLine()));

                System.out.println("Enter new user's email:");
                userList.get(i).setEmail(scanner.nextLine());

                System.out.println("Enter new user's address:");
                userList.get(i).setAddress(scanner.nextLine());

                userList.get(i).setDateUpdate(new Date());
            }
        }
    }

    public void sortUser(Comparator<User> comparator) {
        userList.sort(comparator);
    }


    public User searchId(int id) {
        User temp = new User();
        for (User user : userList) {
            if (user.getId() == id){
                temp = user;
                break;
            }
        }
        return temp;
    }
//
//    @Override
//    public List searchName(String name) {
//        List<User> sameName = new ArrayList<>();
//        for (User user : userList) {
//            if (user.getFullName().toUpperCase().contains(name.toUpperCase())){
//                sameName.add(user);
//            }
//        }
//        return sameName;
//    }
//
//
//    @Override
//    public User searchUserName(String userName) {
//        User temp = new User();
//        for (User user : userList) {
//            if (user.getUserName().toUpperCase().equals(userName.toUpperCase())){
//                temp = user;
//                break;
//            }
//        }
//        return temp;
//    }
//
//    @Override
//    public List searchPassword(String password) {
//        List<User> samePassword = new ArrayList<>();
//        for (User user : userList) {
//            if (user.getPassWord().toUpperCase().equals(password.toUpperCase())){
//                samePassword.add(user);
//            }
//        }
//        return samePassword;
//    }
//
//    @Override
//    public User searchMobile(int mobile) {
//        User temp = new User();
//        for (User user : userList) {
//            if (user.getMobile() == mobile){
//                temp = user;
//                break;
//            }
//        }
//        return temp;
//    }
//
//    @Override
//    public User searchEmail(String email) {
//        User temp = new User();
//        for (User user : userList) {
//            if (user.getEmail().toUpperCase().equals(email.toUpperCase())){
//                temp = user;
//                break;
//            }
//        }
//        return temp;
//    }
//
//    @Override
//    public List searchAddress(String address) {
//        List<User> sameAddress = new ArrayList<>();
//        for (User user : userList) {
//            if (user.getAddress().toUpperCase().contains(address.toUpperCase())){
//                sameAddress.add(user);
//            }
//        }
//        return sameAddress;
//    }
//
//    @Override
//    public List searchUserRole(UserRole userRole) {
//        List<User> sameRole = new ArrayList<>();
//        for (User user : userList) {
//            if (user.getUserRole().equals(userRole)){
//                sameRole.add(user);
//            }
//        }
//        return sameRole;
//    }

}
