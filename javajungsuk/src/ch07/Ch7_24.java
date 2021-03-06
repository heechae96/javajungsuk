package ch07;

public class Ch7_24 {

	public static void main(String[] args) {

		// 인터페이스의 구현
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손");
		}
	}

}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {
		// 내용생략
	}
	public void attack(Unit u) {
		// 내용생략
	}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable{}
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);
}