package Abstract;
// 도형 클래스
abstract public class Shape {
    abstract double area(); // 도형의 면적을 구하는 추상메서드
}
class Circle extends Shape {
    // 추상클래스의 자식클래스는 추상메서드를 오버라이드해야함 (강제성)
    // 단, 자식클래스만의 필드, 메서드등은 자유롭게 정의할 수 있음!!!
    // 추가로 자식클래스만의 추상메서드를 정의하는 것도 가능함
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}