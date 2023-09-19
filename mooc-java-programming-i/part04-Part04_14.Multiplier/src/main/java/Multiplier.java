public class Multiplier {
    private Integer multiplier;

    public Multiplier(int number) {
        this.multiplier = number;
    }
    public int multiply(int number) {
        int multiplication = this.multiplier*number;
        return multiplication;
    }
}
