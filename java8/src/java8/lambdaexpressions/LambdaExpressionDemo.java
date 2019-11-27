package java8.lambdaexpressions;

// Functional interface
interface MyNum {
	double getValue(double num);
}

interface MyString {
	String getValue(String str);
}

//Generic Functional Interface
interface MyValue<T> {
	T get(T t);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
//		Implement interface using lambda expression

//		lambda expression contains one statement
//		without curly braces
		MyNum myNum1 = (double num) -> num;

		System.out.println("MyNum: num: " + myNum1.getValue(123.25));

		MyNum myNum2 = (double num) -> num * 2;
		System.out.println("num * 2: " + myNum2.getValue(123.25));

//		lambda expression contains multiple statements
//		with curly braces

		MyNum myNum3 = blockLambda();

		System.out.println("MyNum: lambda block : " + myNum3.getValue(10));

		MyString myString = (String str) -> str;
		System.out.println("MyString:  " + myString.getValue("India"));

//		Generic Functional Interfaces
		MyValue<Integer> myIntegerValue = (Integer num) -> num;

		MyValue<String> myStringValue = (String str) -> str;

		System.out.println("MyValue: myIntegerValue " + myIntegerValue.get(10));
		System.out.println("MyValue: myStringValue " + myStringValue.get("India"));

//		passing lambda expression as an argument
//      we can also pass block lambda to another method
		System.out.println("Passing lamda to another function: ");
		double res = calculate((double num) -> num);
		System.out.println("Passing lamda to another function: " + res);
	}

	private static double calculate(MyNum myNum) {
		double num = myNum.getValue(100.021);
		return (num * 50) / 100;
	}

	private static MyNum blockLambda() {
		MyNum myNum3 = (double num) -> {

			for (int i = 0; i < 10; i++) {
				num = num + 1;
			}
			return num;
		};

		System.out.println("inside blockLambda");

		return myNum3;
	}
}
