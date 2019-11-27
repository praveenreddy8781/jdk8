package java8.lambdaexpressions;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Myclass1 {

	public static <T> T getValue(T t) {
		return t;
	}

	public static <T> int maxCheck(int num1, int num2) {
//		System.out.println("maxCheck***********");
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void reverse(String str) {
		System.out.println("Method Ref:Consumer: intial str: " + str);
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		System.out.println("Method Ref:Consumer: after reverse str: " + res);
	}

	public static int getValue() {
		return 2000;
	}

	static boolean isPositive(int number) {
		if (number >= 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isNull(String str) {
		if (str != null) {
			return true;
		} else {
			return false;
		}
	}
}

// Predefined Functional Interface
public class LambdaExpressionDemo9 {
	public static void main(String[] args) {

		System.out.println("Interface UnaryOperator<T>::::::::::::::::");
//		Interface UnaryOperator<T>
//		Labmda Expression
		UnaryOperator<Integer> operator1 = (num) -> {
			return num;
		};
		System.out.println("Using lambda : " + operator1.apply(100));

		UnaryOperator<String> operator2 = (str) -> {
			return str;
		};
		System.out.println("Using lambda : " + operator2.apply("Hiiii"));

//		Method reference
		UnaryOperator<Integer> mr1 = Myclass1::getValue;
		System.out.println("Using method ref : " + mr1.apply(100));

		UnaryOperator<String> mr2 = Myclass1::getValue;
		System.out.println("Using method ref : " + mr2.apply("Hiiii"));

		System.out.println("Interface BinaryOperator<T>::::::::::::::::");
//		BinaryOperator
//		Lambda
		BinaryOperator<Integer> binaryOperator1 = (num1, num2) -> {
			if (num1 > num2) {
				return num1;
			} else {
				return num2;
			}
		};

		System.out.println("Lambda: binaryOperator1.apply(100,5) : " + binaryOperator1.apply(100, 50));
		System.out.println("Lambda: binaryOperator1.apply(80,90) : " + binaryOperator1.apply(80, 90));

//		using method ref
		BinaryOperator<Integer> binaryOperator2 = Myclass1::maxCheck;
		System.out.println("Lambda: binaryOperator2.apply(100,5) : " + binaryOperator2.apply(100, 50));
		System.out.println("Lambda: binaryOperator2.apply(80,90) : " + binaryOperator2.apply(80, 90));

		System.out.println("Interface Consumer<T>::::::::::::::::");
//		Consumer<T>
//		Using lambda
		Consumer<String> reverseStr1 = (str) -> {
			System.out.println("Lambda:Consumer: intial str: " + str);
			String res = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				res += str.charAt(i);
			}
			System.out.println("Lambda:Consumer: after reverse str: " + res);
		};

		reverseStr1.accept("Lambda");

//		Method Ref
		Consumer<String> reverseStr2 = Myclass1::reverse;
		reverseStr2.accept("Method Ref");

//		Supplier<T>
//		Lambda
		Supplier<Integer> supplier = () -> {
			System.out.println("Lambda: Supplier: returning 1000");
			return 1000;
		};

		Integer integer = supplier.get();
		System.out.println("Lambda: Supplier: " + integer);

//		Method Ref
		Supplier<Integer> supplier2 = Myclass1::getValue;
		System.out.println("Method Ref: Supplier :: " + supplier2.get());

//		Function<Integer, Boolean>
		Function<Integer, Boolean> function = (number) -> {
			if (number >= 0) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println("Lambda:Function : 10 is positive? : " + function.apply(10));
		System.out.println("Lambda:Function : -10 is positive? : " + function.apply(-10));

//	
		Function<Integer, Boolean> function2 = Myclass1::isPositive;
		System.out.println("Method Ref : Function : 100 is positive?" + function2.apply(100));
		System.out.println("Method Ref : Function : -100 is positive?" + function2.apply(-100));

//		Predicate<T>
		Predicate<String> predicate = (str) -> {
			if (str != null) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println("Lambda : Predicate: isNull? " + predicate.test(null));
		System.out.println("Lambda : Predicate: isNull? " + predicate.test("Test"));

//		Method Ref
		Predicate<String> predicate2 = Myclass1::isNull;
		System.out.println("Method Ref : Predicate: isNull? " + predicate2.test(null));
		System.out.println("Method Ref : Predicate: isNull? " + predicate2.test("Test"));
	}
}
