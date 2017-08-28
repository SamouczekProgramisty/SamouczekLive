package pl.samouczekprogramisty.samouczeklive.interview;

public class LiskovSubstitutionExample {

    private static class Animal {
        public String sound() {
            return "[animal sound]";
        }
    }

    private static class Cat extends Animal {
        @Override
        public String sound() {
            return "meow";
        }
    }

    private static class Dog extends Animal {
        @Override
        public String sound() {
            return "bark";
        }
    }

    private static class BreaksLsp extends Animal {
        @Override
        public String sound() {
            throw new UnsupportedOperationException("Nope, it wasn't implemented yet!");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.sound());

        animal = new Cat();
        System.out.println(animal.sound());

        animal = new Dog();
        System.out.println(animal.sound());

        // Breaks LSP
        animal = new BreaksLsp();
        System.out.println(animal.sound());
    }

}
