package com.practise;

public class Author implements Comparable<Author>{

	String firstName;
	String lastName;
	String bookName;
	
	

	public Author(String firstName, String lastName, String bookName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}



	public static void main(String[] args) {


	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	@Override
	public int compareTo(Author o) {
		return this.lastName.compareTo(o.getLastName());

	}

}
