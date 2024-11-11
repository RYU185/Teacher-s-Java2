package Abstract;

abstract public class Shape {
    abstract double area(); // 도형의 면적을 구하는 추상메서드
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}