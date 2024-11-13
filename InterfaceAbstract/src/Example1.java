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
    public void powerOn() {}
    public void powerOff() {}
    public abstract void doFunction(); // 추상메서드
} 

public class Example1 {
}
