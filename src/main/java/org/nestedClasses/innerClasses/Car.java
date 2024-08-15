package org.nestedClasses.innerClasses;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine (Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        private int horsePower;
//        public static int a = 5;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car car = new Car("White", 4);
        Car.Engine engine = car.new Engine(195);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);


        Car.Engine engine3 = new Car("Black", 5).new Engine(200);


//        Car.Engine engine2 = new car.Engine(195);
    }
}
