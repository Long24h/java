package employee.model;

public abstract class Employee {
    private long id;
    private String fullName;
    private String dob;
    private String phone;
    private String email;
    private Type type;
    private int totalEmployee;
    private static int count = 1;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
    public Employee() {

    }

    public Employee(long id, String fullName, String dob, String phone, String email, Type type) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.totalEmployee = count;
        count++;
    }
    public Employee(long id, String fullName, String bod, String phone, String email, Type type, int totalEmployee) {
        this.id = id;
        this.fullName = fullName;
        this.dob = bod;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.totalEmployee = totalEmployee;
    }
    public Employee(String fullName, String dob, String phone, String email, Type type) {
        this.id = (int)System.currentTimeMillis()%1000000;
        this.fullName = fullName;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.totalEmployee = count;
        count++;
    }

    abstract String showInfo();

}
