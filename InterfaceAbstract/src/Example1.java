// 전자장치 추상클래스
abstract class Device {
    String brand;
    String model;
    public Device() {
    }
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void powerOn() {
        System.out.println(brand + " " + model + " 전원 켜짐");
    }
    public void powerOff() {
        System.out.println(brand + " " + model + " 전원 꺼짐");
    }
    public abstract void doFunction(); // 추상메서드
}
// 휴대폰
class Phone extends Device {
    public Phone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void doFunction() {
        System.out.println("휴대폰으로 전화를 겁니다");
    }
}

public class Example1 {
}
