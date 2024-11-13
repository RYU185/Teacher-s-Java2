// 게임 캐릭터 (추상클래스)
abstract class Character {
    String name;
    int hp; // 생명
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void takeDamage(int amount) {}
    abstract void doAction(); // 추상메서드
}
// 전사
class Warrior extends Character {
    public Warrior(String name, int hp) {
        super(name, hp);
    }
    @Override
    void doAction() {
        System.out.println("전사는 근접 공격");
    }
}
// 마법사
class Mage extends Character {
    public Mage(String name, int hp) {
        super(name, hp);
    }
    @Override
    void doAction() {
        System.out.println("마법사는 마법 공격");   
    }
}

public class Example2 {
    public static void main(String[] args) {

    }
}
