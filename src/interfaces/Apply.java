package interfaces;

import static util.Print.*;

public class Apply {
	public static void process(Processor p,Object input) {
		print("Using Processor"+ p.name());
		print(p.process(input));
	}
}
