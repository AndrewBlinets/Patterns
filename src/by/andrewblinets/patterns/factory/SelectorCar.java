package by.andrewblinets.patterns.factory;

import by.andrewblinets.patterns.factory.car.BMV;
import by.andrewblinets.patterns.factory.car.Moskvich;

/**
 * Created by Андрей on 16.10.2017.
 */
public class SelectorCar {

    private static SelectorCar instance;

    public static synchronized SelectorCar getInstance() {
        if (instance == null)
        {
            instance = new SelectorCar();
        }
        return instance;
    }
    // фабричный метод, который создает нужный автомобиль
    public Car getCar(TypeCar typeCar) {
        Car car = null;
        switch (typeCar) {
            case RUSSIA:
                car = new Moskvich();
                break;
            case GERMANIA:
                car = new BMV();
                break;
        }
        return car;
    }

    private SelectorCar() {
    }
}
