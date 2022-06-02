package ch09;

class Point implements Cloneable{
	// Cloneable인터페이스를 구현한 클래스서만 clone()을 호출 가능
	// 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외 발생
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();	// clone()은 반드시 예외처리 필요
		}catch(CloneNotSupportedException e){}
		
		return obj;
	}
}

public class Ch9_7 {

	public static void main(String[] args) {

		// clone()
		
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();	// 복제(clone)해서 새로운 객체 생성
		System.out.println(original);
		System.out.println(copy);
	}

}
