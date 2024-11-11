package Abstract;
// 결제 시스템 클래스
public abstract class Payment {
    protected double amount; // 금액
    protected String id; // 상점아이디
    public Payment() {
    }
    public Payment(double amount, String id) {
        this.amount = amount;
        this.id = id;
    }
    // 추상메서드
    abstract boolean processPayment(); // 결제진행 메서드
    abstract String getReceipt(); // 영수증발행
}
