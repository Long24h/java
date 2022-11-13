package csvfile;

public class Country {
    private int id;
    private String nameCountry;
    private String codeCountry;

    public Country(int id, String nameCountry, String codeCountry) {
        this.id = id;
        this.nameCountry = nameCountry;
        this.codeCountry = codeCountry;
    }
    public Country(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", id, nameCountry, codeCountry);
    }
}
