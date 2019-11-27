package java8.lambdaexpressions;

@FunctionalInterface
interface MyInterface {
	MyClass fun(int value);
}

@FunctionalInterface
interface SomeOtherInterface {
	int fun(int value);
}

class MyClass {
	int value;

	public MyClass() {
		System.out.println("Default constructor");
	}
	
	public MyClass(int value) {
		this.value = value;
	}

	public int powerOf2() {
		return value * value;
	}
}

//Method references to constructors
public class LambdaExpressionDemo8 {

	public static void main(String[] args) {

//		Method references to constructors
		MyInterface myInterface = MyClass::new;

		MyClass myClass = myInterface.fun(2);
		int result = myClass.powerOf2();
		System.out.println("result: " + result);

		MyClass myClass2 = myInterface.fun(4);
		int result2 = myClass2.powerOf2();
		System.out.println("result: " + result2);
		
//		The constructed object of type MyClass is incompatible with the descriptor's return type: int
//		SomeOtherInterface otherInterface = MyClass::new;
	}
}
