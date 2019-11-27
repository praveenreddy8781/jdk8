package java8.lambdaexpressions;

interface StringFun {
	String func(String str);
}

class StringReverse {
	
	/* Method References to static Methods */	
//	public static String reverse(String str) {
//
//		String reversedStr = "";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			reversedStr += str.charAt(i);
//		}
//		return reversedStr;
//	}
//	
	
//	Method References to Instance Methods
	public String reverse(String str) {

		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		return reversedStr;
	}
}

public class LambdaExpressionDemo6 {

	public static String stringOp(StringFun reverse, String str) {
		return reverse.func(str);
	}

	public static void main(String[] args) {
		String str = "India";

//		Using Lambda
//		StringFun revString =(String str1)-> {
//			String reversedStr = "";
//
//			for (int i = str.length() - 1; i >= 0; i--) {
//				reversedStr += str.charAt(i);
//			}
//			return reversedStr;
//		};
//		
//		System.out.println(revString.func(str));
		
//		Method reference
//		StringFun revString =new StringReverse()::reverse;
//		System.out.println(revString.func(str));
		
		/* Method References to static Methods */
//		String reversedStr = stringOp(StringReverse::reverse, str);
		
//		Method References to Instance Methods
		StringReverse stringReverse = new StringReverse();
		
		StringFun strFun = stringReverse::reverse;
		System.out.println(strFun.func("India"));
		
//		String reversedStr = stringOp(stringReverse::reverse, str);
//		System.out.println(reversedStr);
	}

}
