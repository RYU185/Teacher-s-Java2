/*
학생의 정보와 성적을 관리하는 Student 클래스를 설계하세요.
요구사항:
 학번 (studentId) - 문자열
 이름 (name) - 문자열
 학년 (grade) - 정수

다음 메소드들을 구현하세요:
생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
각 필드의 getter/setter 메소드
*/
class Student {
    private String studentId;
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId("240101");
        s1.setName("Steve");
        s1.setGrade(1);
        System.out.println(s1.getStudentId()); // 240101
        System.out.println(s1.getName()); // Steve
        System.out.println(s1.getGrade()); // 1

        Student s2 = new Student("230211", "Tom", 2);
        System.out.println(s2.getStudentId()); // 230211
        System.out.println(s2.getName()); // Tom
        System.out.println(s2.getGrade()); // 2
    }
}
