package pl.javastart.task.data;

public class Televisor {
    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void  turnOff() {
        this.isOn = false;
    }

    public void showStatus() {
        if (isOn) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telwizor jest wyłączony");
        }
    }
}
