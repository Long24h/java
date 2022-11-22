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

    private Rank(String rank) {
        this.rank = rank;
    }

    public String parseRank(String rank) {
        Rank[] ranks = values();
        for (Rank item : ranks) {
            if (item.getRank().equals(rank)) {
                return rank;
            }
        }
        throw new IllegalArgumentException("Invalid rank!");
    }
}
