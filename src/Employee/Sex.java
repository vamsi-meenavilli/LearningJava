package Employee;

public enum Sex {
    M("Male"), F("Female"), O("Other");

    private String description;

    Sex(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
