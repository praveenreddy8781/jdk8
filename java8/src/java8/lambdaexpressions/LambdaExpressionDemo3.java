package java8.lambdaexpressions;

import java8.lambdaexpressions.Test.FuncInterface1;
import java8.lambdaexpressions.Test.FunctInterface2;

class Test {

	interface FuncInterface1 {
		int operation(int x, int y);
//		void operation1(int x, int y);
	}

	interface FunctInterface2 {
		void print(String msg);
	}

	public int operate(int x, int y, FuncInterface1 fobj) {
		return fobj.operation(x, y);
	}
}

public class LambdaExpressionDemo3 {

	public static void main(String[] args) {
		FuncInterface1 add = (int x, int y) -> {
			return x + y;
		};

		FuncInterface1 multiply = (int x, int y) -> {
			return x * y;
		};

		FunctInterface2 printer = (String msg) -> {
			System.out.println(msg);
		};

		Test t = new Test();
		int resOfAddition = t.operate(10, 20, add);
		printer.print("resOfAddition: " + resOfAddition);

		int resOfMulty = t.operate(10, 20, multiply);
		printer.print("resOfMulty: " + resOfMulty);

	}
}
