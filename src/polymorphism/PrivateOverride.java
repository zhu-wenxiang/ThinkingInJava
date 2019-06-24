package polymorphism;

public class PrivateOverride {
	private void f() {System.out.println("this is the f function of privateOverride");}
	public static void main(String[] args) {
		PrivateOverride privateOverride=new Derived();
		privateOverride.f();
	}
}

class Derived extends PrivateOverride{
	public void f() {System.out.println("this is the f function of Derived class");}
	public static void main(String[] args) {
		PrivateOverride privateOverride=new Derived();
		//privateOverride.f();
	}
}
