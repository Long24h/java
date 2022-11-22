package employee.model;

public enum Type {
    EXPERIENCE("EXPERIENCE"),
    FRESHER("FRESHER"),
    INTERN("INTERN");
    private String type;

    private Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String parseType(String type) {
        Type[] types = values();
        for (Type item : types) {
            if (item.getType().equals(type)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid type enums!");
    }
}
