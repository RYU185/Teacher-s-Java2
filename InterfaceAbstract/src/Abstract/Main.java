package Abstract;

public class Main {
    public static void main(String[] args) {
        // Calculator
        Addition addition = new Addition();
        addition.displayResult(2,4); // Result : 6.0
        Multiply multiply = new Multiply();
        multiply.displayResult(2,4); // Result : 8.0

        // Shape
        Shape circle = new Circle(5);
        System.out.println(circle.area()); // 78.53981633974483
        Shape rectangle = new Rectangle(4,6);
        System.out.println(rectangle.area()); // 24
    }
}







