public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101
        System.out.println(Integer.toOctalString(data)); // 15
        System.out.println(Integer.toHexString(data)); // d
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13
        System.out.println(Integer.parseInt("15", 8)); // 13
        System.out.println(Integer.parseInt("d", 16)); // 13
        System.out.println();

        System.out.println(13); // 13
        System.out.println(0b1101); // 13
        System.out.println(015); // 13
        System.out.println(0xd); // 13
        System.out.println();

        // & 비트연산자
        System.out.println(3 & 10); // 2
        System.out.println(12 & 9); // 8
        // | 비트연산자
        System.out.println(3 | 10); // 11
        // ^ 비트연산자
        System.out.println(3 ^ 10); //
        // ! 비트연산자
        System.out.println(~3); //
    }
}







