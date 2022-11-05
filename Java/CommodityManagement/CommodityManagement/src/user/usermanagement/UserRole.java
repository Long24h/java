package user.usermanagement;

public enum UserRole {
    ADMIN("ADMIN"), USER("USER");

    private String value;

    private UserRole() {

    }

    private UserRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public static UserRole parseUserRole(String value) {
//        UserRole[] values = values();
//        for (UserRole userRole : values) {
//            if (userRole.value.equals(value)) {
//                return userRole;
//            }
//            throw new IllegalArgumentException("Invalid user role");
//        }
//    }
}
