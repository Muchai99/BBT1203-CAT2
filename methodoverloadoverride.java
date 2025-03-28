// Method Overloading
class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Method Overriding and Polymorphism
class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Demonstration
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("2*3: " + math.multiply(2, 3));
        System.out.println("2*3*4: " + math.multiply(2, 3, 4));

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Woof
        myCat.makeSound(); // Output: Meow
    }
}