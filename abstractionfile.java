// Abstract class
abstract class Appliance {
    abstract void turnOn();
}

// Subclass Fan
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now ON.");
    }
}

// Subclass TV
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now ON.");
    }
}

// Demonstration
public class Main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance tv = new TV();

        fan.turnOn();
        tv.turnOn();
    }
}