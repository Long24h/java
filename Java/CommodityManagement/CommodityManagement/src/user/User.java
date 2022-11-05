package user;

import user.usermanagement.UserRole;

import javax.management.relation.Role;
import java.util.Date;

public class User {
    private int id;
    private String userName;
    private String passWord;
    private String fullName;
    private int mobile;
    private String email;
    private String address;
    private UserRole userRole;
    private Date dateCreate;
    private Date dateUpdate;
    private static int count = 111;

    public User(){

    }

    public User(String userName, String passWord, String fullName, int mobile, String email, String address, UserRole userRole) {
        this.id = count++;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.userRole  = userRole;
        this.dateCreate = new Date();
        this.dateUpdate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "id: " + id + ", user name: " + userName + ", password: " + passWord + ", full name: " + fullName + ", mobile: "
                + mobile + ", email: " + email + ", address: " + address + ", role: " + userRole + ", date create: " + dateCreate
                + ", date update: " + dateUpdate;
    }
}
