package employee.model;

public class Certificate {
    private long id;
    private String name;
    private Rank rank;
    private String releaseDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Certificate() {

    }

    public Certificate(long id, String name, Rank rank, String releaseDate) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.releaseDate = releaseDate;
    }
    public Certificate(String name, Rank rank, String releaseDate) {
        this.id = System.currentTimeMillis()%1000000;
        this.name = name;
        this.rank = rank;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", id, name, rank, releaseDate);
    }
}
