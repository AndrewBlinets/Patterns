package by.andrewblinets.patterns;

import by.andrewblinets.patterns.factory.Car;
import by.andrewblinets.patterns.factory.SelectorCar;
import by.andrewblinets.patterns.factory.TypeCar;
import by.andrewblinets.patterns.singlenton.TestSinglenton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestSinglenton.getInstance().print();
        TestSinglenton.getInstance().print();
        TestSinglenton.getInstance().print();

        SelectorCar carSelector = new SelectorCar();
        System.out.println("Germania");
        Car car = carSelector.getCar(TypeCar.GERMANIA);
        car.start();
        car.stop();
        System.out.println("Russia");
        car = carSelector.getCar(TypeCar.RUSSIA);
        car.start();
        car.stop();
    }
}
