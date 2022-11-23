package employee.model;

import java.util.List;

public class Fresher extends Employee {
    private String GraduationDate;
    private String Education;
    private Rank rank;

    public Fresher() {

    }

    public Fresher(long id, String fullName, String bod, String phone, String email, Type type, int totalEmployee,
                   String graduationDate, String education, Rank rank) {
        super(id, fullName, bod, phone, email, type, totalEmployee);
        GraduationDate = graduationDate;
        Education = education;
        this.rank = rank;
    }
    public Fresher(long id, String fullName, String bod, String phone, String email, Type type, String graduationDate,
                   String education, Rank rank) {
        super(id, fullName, bod, phone, email, type);
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
                getType(), getGraduationDate(), getEducation(), getRank());
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getFullName(), getDob(), getPhone(), getEmail(),
                getType(), getGraduationDate(), getEducation(), getRank());
    }

    public static Fresher parseFresher(String raw) {
        String[] fields = raw.split(",");

        long id = Long.parseLong(fields[0]);
        String name = fields[1];
        String dob = fields[2];
        String phone = fields[3];
        String email = fields[4];
        Type type = Type.parseType(fields[5]);
        String graduationDate = fields[6];
        String education = fields[7];
        Rank rank = Rank.parseRank(fields[8]);

        return new Fresher(id, name, dob, phone, email, type, graduationDate, education, rank);
    }
}
