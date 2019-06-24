package polymorphism;

class Meal{
	static {
		System.out.println("now we're in a Meal object's static initializer");
	}
	Cheese cheese=new Cheese("Meal");
	Bread bread=new Bread("Meal");
	public Meal() {
		System.out.println("this is the meal constructor");
	}
}

class Bread{
	static {
		System.out.println("now we're in a Bread object's static initializer");
	}
	public Bread() {
		System.out.println("this is the Bread constructor");
	}
	public Bread(String where) {
		System.out.println("this is the Bread in "+where);
	}
}

class Cheese{
	static {
		System.out.println("we're in the cheese static initializer");
	}
	public Cheese() {
		System.out.println("now we step in chesse constructor, cheese is definitely the power");
	}	
	public Cheese(String where) {
		System.out.println("this is the cheese in "+where);
	}
}

class Lettuce{
	static {
		System.out.println("we're in the Lettuce static initializer");
	}
	public Lettuce() {
		System.out.println("now I am in Lettuce constructor");
	}
}

class Lunch extends Meal{
	Cheese cheese=new Cheese("Lunch");
	static {
		System.out.println("we're in the Lunch static initializer");
	}
	Bread bread=new Bread("Lunch");
	public Lunch() {
		System.out.println("yes, I am in the Lunch constructor, I will eat it at 12 o'clock");
	}
}

class PortableLunch extends Lunch{
	static {
		System.out.println("we're in the PortableLunch static initializer");
	}
	public PortableLunch() {
		System.out.println("the portable lunch constructor, I often eat take outs,maybe it could be called portable lunch, ");
	}
	public PortableLunch(String name) {
		System.out.println("the portable lunch "+name);
	}
}

public class Sandwich extends PortableLunch{
	private Bread bread=new Bread("Sandwich");
	private Cheese cheese=new Cheese("Sandwich");
	public Sandwich() {
		System.out.println("we're in the Sandwich constructor,yes finally!!");
	}
	public Sandwich(int number) {
		System.out.println("this is the "+number+" sandwich");
	}
	public static void main(String[] args) {
		Sandwich sandwich1=new Sandwich(1);
		PortableLunch sandwich2=new Sandwich(2);
		Lunch sandwich3=new Sandwich(3);
		Lunch lunch=new PortableLunch("酸菜鱼"); 

	}

}
