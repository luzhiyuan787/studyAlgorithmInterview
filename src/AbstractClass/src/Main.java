package AbstractClass.src;

public class Main {

	public static void main(String[] args) {
		Shape s1 = new Rect(60,10);
		Shape s2 =new Circle(30);
		System.out.println(""+s1.area());
		System.out.println(""+s2.area());
	}

}
