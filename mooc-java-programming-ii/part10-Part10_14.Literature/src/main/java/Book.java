public class Book {
    private String name;
    private int AgeRecommendation;
    public Book(String name,int AgeRecommendation) {
        this.name = name;
        this.AgeRecommendation = AgeRecommendation;
    }
    public String getName() {
        return name;
    }
    public int getAgeRecommendation() {
        return AgeRecommendation;
    }

    public String toString() {
        return this.getName() + "(recommended for " + this.getAgeRecommendation() + " years-olds or older)";
    }
}
