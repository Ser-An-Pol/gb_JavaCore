package shop;

public enum Gender {
    MALE("Мужской пол"),
    FEMALE("Женский пол");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
