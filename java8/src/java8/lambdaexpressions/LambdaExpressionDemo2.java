package java8.lambdaexpressions;

import java.util.ArrayList;

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
//		creating arraylist
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Bangalore");
		arrayList.add("Mysore");
		arrayList.add("Hyderabad");
		arrayList.add("Mumbai");

//		Printing elements of arraylist using lambda expression

//		arrayList.forEach((String city)->System.out.println(city));
//		arrayList.forEach(city -> System.out.println(city));
		
		arrayList.forEach((String  city) -> {
			System.out.println("Hi " + city);
		});
	}
}
