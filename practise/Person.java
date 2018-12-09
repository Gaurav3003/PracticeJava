package com.practise;

public class Person implements Comparable<Person> {

	int id;
	String name;
	
	

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		return p.name.compareTo(this.name);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
