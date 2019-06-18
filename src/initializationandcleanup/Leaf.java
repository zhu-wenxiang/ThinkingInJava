package initializationandcleanup;

public class Leaf {
	int i=0;
	Leaf increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i is "+i);
	}

	public static void main(String[] args) {
		Leaf leaf=new Leaf();
		leaf.increment().increment().increment().increment().print();;
	}

}
