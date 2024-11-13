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
class Warrior extends Character {}
// 마법사
class Mage extends Character {}

public class Example2 {
    public static void main(String[] args) {

    }
}
