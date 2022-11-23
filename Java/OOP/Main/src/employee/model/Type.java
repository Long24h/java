package employee.model;

public enum Type {
    EXPERIENCE("EXPERIENCE"),
    FRESHER("FRESHER"),
    INTERN("INTERN");
    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Type parseType(String type) {
        for (Type item : values()) {
            if (item.getType().equalsIgnoreCase(type)) {
                return item;
            }
        }
        throw new IllegalArgumentException("Invalid type enums!");
    }
}
