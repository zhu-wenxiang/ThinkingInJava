package polymorphism;

class StaticSuper{
	public static String staticGet() {
		return "static Super static get method";
	}
	
	public String dynamicGet() {
		return "staticSuper dynamic get method";
	}
}

class StaticSub extends StaticSuper{
	public static String staticGet() {
		return "static sub static get method";
	}
	public String dynamicGet() {
		return "static sub dynamic get method";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper staticSuper=new StaticSub();
		System.out.println(staticSuper.staticGet());
		System.out.println(staticSuper.dynamicGet());
	}

}
