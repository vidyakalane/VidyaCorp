package exception;

public class StackOverflow {
public void m1() {
	System.out.println("m1 method");
	m2();
}
public void m2() {
	System.out.println("m2 method");
	m1();
}
public static void main(String[] args) {
	StackOverflow obj1=new StackOverflow();
	obj1.m2();
}
}
