package P1029;

public class MyClass {
    public static void main(String[] args) {
        Student steve = new Student("Steve", 25);
        Student tom = new Student();
        Student sam = new Student("Sam", 29, "대전"
                , "남", 100, 90, 80);
        System.out.println(steve.name); // Steve
        System.out.println(steve.address); // null
        System.out.println(tom.name); // null
        System.out.println(sam.name); // sam
        System.out.println(sam.scoreHistory); // 90.0
        // 메서드의 사용
        // 외부클래스가 가지고 있는 메서드이므로 해당 클래스의 인스턴스를 명시해야함!!
        System.out.println(steve.sumScore());
        System.out.println(tom.sumScore());
        System.out.println(sam.sumScore());
    }
}





