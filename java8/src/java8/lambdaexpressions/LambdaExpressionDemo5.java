package java8.lambdaexpressions;

interface MyFunc {
	int fun(int i);
}

/*
 * The following program illustrates the difference between effectively final
 * and mutable local variables:
 */
public class LambdaExpressionDemo5 {

	static int i = 100;

	public static void main(String[] args) {
//		local variable
		int num = 100;

//		num should be effectively final
//		num = 200;
		
		MyFunc func = (int x) -> {
//			Local variable num defined in an 
//			enclosing scope must be final or effectively final
//			Hence Cann't modified num
//			num = 10;

//			This is allowed as we are not modifying num here
			int result = x + num + i;

//			instance variable can be used in lambda expression
			i = 200;
//			System.out.println("instance var can be used i= " + i);	
			return result;
		};

		System.out.println(func.fun(100));
	}
}
