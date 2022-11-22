package employee.model;

public class Fresher extends Employee {
    private String GraduationDate;
    private String Education;
    private Rank rank;

    public Fresher() {

    }

    public Fresher(int id, String fullName, String bod, String phone, String email, Type type, int totalEmployee,
                   String graduationDate, String education, Rank rank) {
        super(id, fullName, bod, phone, email, type, totalEmployee);
        GraduationDate = graduationDate;
        Education = education;
        this.rank = rank;
    }

    public Fresher(String fullName, String bod, String phone, String email, Type type, int totalEmployee,
                   String graduationDate, String education, Rank rank) {
        super(fullName, bod, phone, email, type);
        GraduationDate = graduationDate;
        Education = education;
        this.rank = rank;
    }

    public Fresher(String fullName, String bod, String phone, String email, Type type, String graduationDate,
                   String education, Rank rank) {
        super(fullName, bod, phone, email, type);
        GraduationDate = graduationDate;
        Education = education;
        this.rank = rank;
    }

    public String getGraduationDate() {
        return GraduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        GraduationDate = graduationDate;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    String showInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getFullName(), getDob(), getPhone(), getEmail(),
                getType(), getGraduationDate(), getRank(), getEducation());
    }
}
