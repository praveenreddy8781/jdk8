package java8.defaultmethods;

interface Square {

	int square(int x);

	static void staticMethod() {
		System.out.println("staticMethod::: ");
	}

	default void privateMethod() {
		System.out.println("privateMethod");
	}
}

public class StaticMethodsInInterface {

	public static void main(String[] args) {
		Square.staticMethod();
	}
}
