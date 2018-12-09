package com.practise;

import java.util.SortedSet;
import java.util.TreeSet;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> lst = new ArrayList<String>();
		lst .add("a");
		lst.add("b");
		lst.add("c");
		
		String[] strArray = new String[lst.size()];
		strArray = lst.toArray(strArray);
		System.out.println(Arrays.toString(strArray));
		
		List<Integer> ints = new ArrayList<>();
		for (int i = 0; i < 10; i++) ints.add(i);
		
		ints.removeIf(x -> {return x%3 ==0;});
		
		System.out.println(ints.toString());*/
		
		SortedSet<Person> sortedSet = new TreeSet<>();
		sortedSet.add(new Person(1, "Mark"));
		sortedSet.add(new Person(2, "Vispi"));
		sortedSet.add(new Person(3, "Harmony"));
		sortedSet.forEach(System.out::println);
		
		SortedSet<Person> customOrderedSet = new TreeSet<>((p1,p2) -> p1.id - p2.id);
		customOrderedSet.addAll(sortedSet);
		customOrderedSet.forEach(System.out::println);

	}

}
