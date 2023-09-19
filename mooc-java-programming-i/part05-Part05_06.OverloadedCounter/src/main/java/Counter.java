public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value = value + increaseBy;
        }
    }

    public void decrease(int decreaseBY) {
        if (decreaseBY > 0) {
            this.value = value - decreaseBY;
        }
    }
}