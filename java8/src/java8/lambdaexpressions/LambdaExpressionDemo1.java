package java8.lambdaexpressions;

interface FuncInterface {
	void abstractFun(int x);

	default void func() {
		System.out.println("Normal function");
	}
}

public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
//		creating an lamdba expression

		FuncInterface fobj = (int x) -> {

			System.out.println("X:: " + x);

			int res = x * 2;
			System.out.println("result: " + res);
		};

		fobj.abstractFun(10);
	}

}
