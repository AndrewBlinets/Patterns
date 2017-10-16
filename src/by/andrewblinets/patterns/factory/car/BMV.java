package by.andrewblinets.patterns.factory.car;

import by.andrewblinets.patterns.factory.Car;

/**
 * Created by Андрей on 16.10.2017.
 */
public class BMV implements Car {
    @Override
    public void start() {
        System.out.println(" Start 10 s");
    }

    @Override
    public void stop() {
        System.out.println(" Stop 10 s");
    }
}
