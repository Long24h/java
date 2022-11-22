package employee.model;

public class Intern extends Employee{
    private String majors;
    private Semester semester;
    private String uniName;

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Intern(int id, String fullName, String dob, String phone, String email, Type type, int totalEmployee,
                  String majors, Semester semester, String uniName) {
        super(id, fullName, dob, phone, email, type, totalEmployee);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }

    public Intern(String fullName, String dob, String phone, String email, Type type, int totalEmployee, String majors,
                  Semester semester, String uniName) {
        super(fullName, dob, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }

    public Intern(String fullName, String dob, String phone, String email, Type type, String majors, Semester semester,
                  String uniName) {
        super(fullName, dob, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }

    @Override
    String showInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getFullName(), getDob(), getPhone(), getEmail(),
                getType(), getMajors(), getSemester(), getUniName());
    }
}
