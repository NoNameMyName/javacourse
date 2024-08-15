package org.lambda;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer  ;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> {return new Car("Ford", "White", 2.0);});
        System.out.println(ourCars);
        changeCar(ourCars.get(0), car -> car.engine = 4.4);
        System.out.println(ourCars.get(0));
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
