public class Example1 {
    public static void main(String[] args) {
        plus1(2,5);
        int result = plus2(2,5); // 리턴결과를 변수에 담아서 사용하는 경우
        System.out.println(result);
        System.out.println(plus2(2,5)); // 직접 사용하는 경우
    }

    public static void plus1(int a, int b) {
        System.out.println(a + b);
    }
    public static int plus2(int a, int b) {
        int c = a + b;
        return c;
    }
}
