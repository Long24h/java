package employee.model;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience() {

    }

    public Experience(int id, String fullName, String bod, String phone, String email, Type type, int totalEmployee,
                      int expInYear, String proSkill) {
        super(id, fullName, bod, phone, email, type, totalEmployee);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String fullName, String dob, String phone, String email, Type type, int expInYear, String proSkill) {
        super(fullName, dob, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(long id, String fullName, String dob, String phone, String email, Type type, int expInYear,
                      String proSkill) {
        super(id, fullName, dob, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    String showInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getId(), getFullName(), getDob(), getPhone(), getEmail(),
                getType(), getExpInYear(), getProSkill());
    }

    public static Experience parseExp(String raw) {
        String[] fields = raw.split(",");

        long id = Long.parseLong(fields[0]);
        String fullName = fields[1];
        String dob = fields[2];
        String phone = fields[3];
        String email = fields[4];
        Type type = Type.valueOf(Type.parseType(fields[5]));
        int expInYear = Integer.parseInt(fields[6]);
        String proSkill = fields[7];


        return new Experience(id, fullName, dob, phone, email, type, expInYear, proSkill);
    }
}
