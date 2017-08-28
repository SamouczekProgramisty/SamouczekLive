package pl.samouczekprogramisty.samouczeklive.interview;

public class InversionOfControl {

    private interface Engine {
        default void start() {
            System.out.println(getType() + " engine started!");
        }

        String getType();
    }

    private static class DiselEngine implements Engine {
        @Override
        public String getType() {
            return "DISEL";
        }
    }

    private static class PetrolEngine implements Engine {
        @Override
        public String getType() {
            return "PETROL";
        }
    }

    private static class ElectricEngine implements Engine {
        @Override
        public String getType() {
            return "ELECTRIC";
        }
    }

    private static abstract class Car {
        Engine engine;

        void startEngine() {
            engine.start();
        }
    }

    private static class OldCar extends Car {
        OldCar() {
            engine = new PetrolEngine();
        }
    }

    private static class ModernCar extends Car {
        ModernCar(Engine engine) {
            this.engine = engine;
        }
    }

    public static void main(String[] args) {
        System.out.println("Without Dependency Inversion");
        Car car = new OldCar();
        car.startEngine();

        System.out.println();
        System.out.println("With Dependency Inversion");
        car = new ModernCar(new ElectricEngine());
        car = new ModernCar(new DiselEngine());
        car.startEngine();
    }

}
