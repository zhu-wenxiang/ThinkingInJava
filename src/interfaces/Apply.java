package interfaces;

import javax.swing.text.PlainDocument;

public class Apply {
	public static void process(Processor p,Object input) {
		System.out.println("Using Processor:"+p.name());
		System.out.println(p.process(input));
	}
}
