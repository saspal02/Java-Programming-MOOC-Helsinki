package application;

public class StandardSensor implements Sensor {
    private int value;
    public StandardSensor(int value) {
        this.value = value;
    }
    public boolean isOn() {
        return true;
    }
    public void setOn() {
        // No effect on a standard sensor
    }
    public void setOff() {
        // No effect on a standard sensor
    }
    public int read() {
        if (true) {
            return value;
        } else {
            throw new IllegalStateException("Illegal state!");
        }
    }

}
