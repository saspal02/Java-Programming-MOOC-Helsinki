
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number) {
        count++;
        this.sum = sum + number;
    }
    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }
    public double average() {
        double average;
        if ( count == 0 ) {
            average = 0;
        } else {
            average = sum*1.0/count;
        }
        return average;
    }

}
