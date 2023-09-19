public class Film {
    private String name;
    private Integer agerating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.agerating = filmAgeRating;
    }

    public String name() {
        return name;
    }
    public int ageRating() {
        return agerating;
    }
}
