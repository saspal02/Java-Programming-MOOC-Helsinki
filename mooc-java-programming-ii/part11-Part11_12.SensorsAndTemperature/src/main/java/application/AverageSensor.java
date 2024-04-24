package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }
    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }
    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }
    public int read() {
        int sum = 0;
        if (isOn() && !sensors.isEmpty()) {
            for (Sensor s: sensors) {
                sum = sum + s.read();
            }
            int average = sum/sensors.size();
            readings.add(average);
            return average;
        } else {
            throw new IllegalStateException("Error getting average of sensors");
        }
    }
    public List<Integer> readings() {
        return this.readings;
    }

}
