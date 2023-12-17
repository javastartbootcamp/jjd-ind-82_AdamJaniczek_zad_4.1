package pl.javastart.task;

import pl.javastart.task.data.Televisor;

public class Main {

    public static void main(String[] args) {
        Televisor samsung = new Televisor();
        samsung.showStatus();
        samsung.turnOn();
        samsung.showStatus();
        samsung.turnOff();
        samsung.showStatus();
    }
}
