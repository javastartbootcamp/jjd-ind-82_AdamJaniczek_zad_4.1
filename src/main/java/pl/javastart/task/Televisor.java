package pl.javastart.task;

public class Televisor {
    private boolean isOn;

    void turnOn() {
        this.isOn = true;
    }

    void  turnOff() {
        this.isOn = false;
    }

    void showStatus() {
        if (isOn) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telwizor jest wyłączony");
        }
    }
}
