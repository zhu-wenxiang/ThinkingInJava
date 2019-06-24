package polymorphism;

import java.util.*;

class Instrument3{
	void play(Note n) {System.out.println("Instrument play: "+n);}
	String what() {return "Instrument3";}
	void adjust() {System.out.println("adjusting the Instrument3");}
}

class Wind3 extends Instrument3{
	@Override
	void play(Note n) {System.out.println("Wind3 play "+n);}
	@Override
	String what() {return "wind3";}
	@Override
	void adjust() {System.out.println("adjusting the Wind3");}
}

class Percussion extends Instrument3{
	void play(Note n) {System.out.println("Percussion play "+n);}
	String what() {return "Percussion";}
	void adjust() {System.out.println("adjusting the Percussion");}
}

class Brass extends Wind3{
	void play(Note n) {System.out.println("Brass play "+n);}
	String what() {return "Brass";}
	void adjust() {System.out.println("adjusting the Brass");}
}

public class Music3 {
	public static void tune(Instrument3 i) {
		i.play(Note.C_SHARP);
	}
	
	public static void tuneAll(Instrument3[] iList) {
		for (Instrument3 instrument3 : iList) {
			instrument3.play(Note.B_FLAT);
		}
	}
	public static Instrument3 next() {
		Random random=new Random();
		switch (random.nextInt(3)) {
		default:
		case 1:
			return new Wind3();
		case 2:
			return new Percussion();
		case 0:
			return new Brass();
		}
	}
	
	public static void main(String[] args) {
		Instrument3[] orchestra= {
				new Wind3(),
				new Percussion(),
				new Brass()
		};

		tuneAll(orchestra);
		//this is the test of Exercise 8
		System.out.println("Test Exercise 8");
		for (int i = 0; i <10; i++) {
			System.out.println(next());
		}
	}
}
