package polymorphism;

class Instrument6{
	void play(Note n) {System.out.println("Instrument play: "+n);}
	//如果不加上public，就会提示can't reduce the visibility的错误，无法把public降成package
	public String toString() {return "Instrument6";}
	void adjust() {System.out.println("adjusting the Instrument6");}
}

class Wind6 extends Instrument6{
	@Override
	void play(Note n) {System.out.println("Wind6 play "+n);}
	@Override
	public String toString() {return "wind6";}
	@Override
	void adjust() {System.out.println("adjusting the Wind6");}
}

class Percussion6 extends Instrument6{
	void play(Note n) {System.out.println("Percussion play "+n);}
	public String toString() {return "Percussion";}
	void adjust() {System.out.println("adjusting the Percussion");}
}

class Brass6 extends Wind6{
	void play(Note n) {System.out.println("Brass play "+n);}
	public String toString() {return "Brass";}
	void adjust() {System.out.println("adjusting the Brass");}
}

public class Exercise6{
	public static void tune(Instrument3 i) {
		i.play(Note.C_SHARP);
	}
	
	public static void tuneAll(Instrument6[] iList) {
		for (Instrument6 instrument6 : iList) {
			instrument6.play(Note.B_FLAT);
		}
	}
	public static void main(String[] args) {
		Instrument6[] orchestra= {
				new Wind6(),
				new Percussion6(),
				new Brass6()
		};
		for (Instrument6 instrument6 : orchestra) {
			System.out.println(instrument6);
		}

		tuneAll(orchestra);
	}
}

