package polymorphism;

public class Shapes {
	private static RandomShapeGenerator generator=new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] shapes=new Shape[9];
		for (int j = 0; j < shapes.length; j++) {
			shapes[j]=generator.next();
		}
		for (Shape shape : shapes) {
			shape.draw();
			shape.erase();
		}
	}
}
