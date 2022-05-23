package com.te.learnjava8.basic.reference;


class SomeClass {
	private int a;

	public SomeClass() {
		super();
	}

	public SomeClass(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
public class ReferenceDemo {
	public static void main(String[] args) {
		SomeClass someClass = new SomeClass();
		someClass.setA(10);
		
		SomeClass someClass2 = someClass;
		someClass2.setA(20);
		
		SomeClass someClass3 = someClass;
		someClass3.setA(30);
		
		System.out.println(someClass.getA());
		
	}	
}
