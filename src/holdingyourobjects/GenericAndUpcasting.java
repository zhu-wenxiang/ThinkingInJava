package holdingyourobjects;

import java.util.ArrayList;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}

public class GenericAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Gala());
		for (Apple apple : apples) {
			System.out.println(apple);
		}
	}

}
