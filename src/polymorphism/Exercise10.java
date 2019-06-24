package polymorphism;

class Rodent{
	public void eat() {
		System.out.println("Rodent's eating");
	}
	public void rest() {
		eat();
		System.out.println("Have a rest after you eat");
	}
}

class Mouse extends Rodent{
	public void rest() {
		System.out.println("this is the Mouse resting");
	}
}

public class Exercise10 {
	public static void main(String[] args) {
		Rodent rodentMouse=new Mouse();
		rodentMouse.eat();
		//虽然这里转型了，但是由于polymorphism，在绑定了mouse过后，会产生正确的行为
		rodentMouse.rest();
	}

}
