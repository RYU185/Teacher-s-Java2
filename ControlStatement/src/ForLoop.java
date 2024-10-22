public class ForLoop {
    public static void main(String[] args) {
        // 일반형 (10회반복)
        for(int i=0; i<10; i++) {
            //System.out.println(i);
            System.out.print(i + " "); // 개행하지 않는 print 메서드 사용
        }
        System.out.println("끝");
        // 감소형 (10회반복)
        for(int i=10; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("끝");
        // 증감식의 변화 (2씩 증가하기)
        for(int i=0; i<10; i=i+2) {
            System.out.print(i + " ");
        }
        System.out.println("끝");
        // iterator(반복자)가 여러개인 경우
        for(int i=0, j=0; i<10; i++, j++) {
            System.out.print(i + "," + j + " ");
        }
        System.out.println("끝");
    }
}








