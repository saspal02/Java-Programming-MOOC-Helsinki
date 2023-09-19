public class Container {
    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }
    public int contains() {
        return this.liquidAmount;
    }
    public void add (int amount) {
        if (amount < 0) {
            liquidAmount = liquidAmount;
        } if (amount > 0) {
            liquidAmount = amount + liquidAmount;
        } if (liquidAmount > 100) {
            liquidAmount = 100;
        }
    }

    public void remove (int amount) {
        if (amount > 0) {
            liquidAmount = liquidAmount - amount;
        } if (liquidAmount < 0) {
            liquidAmount = 0;
        }
    }

    public String toString() {
        return liquidAmount + "/100";
    }

}
