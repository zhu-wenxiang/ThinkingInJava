package holdingyourobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		Integer[] moreInts= {9,10,22,3,34,5,4,5};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 29,390,34);
		System.out.println(collection);
	}
}
