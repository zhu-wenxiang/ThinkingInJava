package util;

import java.io.PrintStream;

public class Print {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static PrintStream printf(String format,Object... objs) {
		return System.out.printf(format, objs);
	}

}
