package holdingyourobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import static util.Print.*;

public class PrintingContainers {
	static Collection fill(Collection<String> collection){
		collection.add("Carl");
		collection.add("欧阳娜娜");
		collection.add("张雪迎");
		collection.add("Amma");
		return collection;
	}
	static Map fill(Map<String, String> pets) {
		pets.put("Dog", "James");
		pets.put("cat", "Bond");
		pets.put("panda", "SiChuan");
		pets.put("dinasor", "deadMan");
		return pets;
	}

	public static void main(String[] args) {
	}

}
