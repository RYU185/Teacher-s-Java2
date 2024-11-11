package Abstract;

import java.awt.event.ComponentEvent;

abstract public class Vehicle {
    String model; // 차량의 모델명

    public Vehicle() {
    }

    abstract void drive();
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println(model + "은 길위에서 달린다");
    }
}
class Boat extends Vehicle {
    @Override
    void drive() {
        System.out.println(model + "은 물위에서 달린다");
    }
}
