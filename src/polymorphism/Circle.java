package polymorphism;

public class Circle extends Shape{
	public void draw() {
		System.out.println("It's circle drawing");
	}
	public void erase() {
		System.out.println("It's shape erasing");
	}
}
