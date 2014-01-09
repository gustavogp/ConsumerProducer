package main.java.ConsumerProducerEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortMe {

	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<String>();
		s.add(new String("Red"));
		s.add(new String("White"));
		s.add(new String("Blue"));
		System.out.println(s);
		List<String> c = Collections.synchronizedList(new ArrayList<String>()); //just testing synchronization

	}

}
