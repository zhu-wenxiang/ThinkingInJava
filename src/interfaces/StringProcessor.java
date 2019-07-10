package interfaces;

public abstract class StringProcessor implements Processor{
	public static String s="If she weighs the same as a duck, she's made of wood";
	//在运行时获得类的信息，使用接口定义方法
	public String name() {
		return getClass().getSimpleName();
	}


	public abstract Object process(Object input); 

	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}

class Upcase extends StringProcessor{
	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor{
	@Override
	public Object process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor{

	@Override
	public Object process(Object input) {
		return ((String)input).split(" ");
	}
	
}