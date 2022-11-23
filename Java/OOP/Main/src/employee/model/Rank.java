package employee.model;

public enum Rank {
    EXCELLENCE("EXCELLENCE"),
    GOOD("GOOD"),
    MEDIUM("MEDIUM");

    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    Rank(String rank) {
        this.rank = rank;
    }

    public static Rank parseRank(String rank) {
        for (Rank item : values()) {
            if (item.getRank().equalsIgnoreCase(rank)) {
                return item;
            }
        }
        throw new IllegalArgumentException("Invalid rank!");
    }
}
