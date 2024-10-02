package Assignment6;

abstract class Animal {
    final int weight;  
    final String name;

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    abstract public void sound();
    abstract public void move();
}

class Dog extends Animal {
    public Dog(String name, int weight) {
        super(weight, name);
    }

    public void sound() {
        System.out.println("Bark..");
    }

    public void move() {
        System.out.println("runs");
    }
}

class Cat extends Animal {
    public Cat(String name, int weight) {
        super(weight, name);
    }

    public void sound() {
        System.out.println("Meow");
    }

    public void move() {
        System.out.println("runs and walks with paws");
    }
}

class Bird extends Animal {
    public Bird(String name, int weight) {
        super(weight, name);
    }

    public void sound() {
        System.out.println("Chirp");
    }

    public void move() {
        System.out.println("flying with wings");
    }
}

 class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 12);
        dog.sound();
        dog.move();

        Cat cat = new Cat("Katty", 6);
        cat.sound();
        cat.move();

        Bird bird = new Bird("Rosy", 3);
        bird.sound();
        bird.move();
    }
}
