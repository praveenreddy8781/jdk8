package java8.lambdaexpressions;

interface CountDuplicates<T> {
	int countMatching(T[] vals, T v);
}

class DuplicateCounter {

	static <T> int countDups(T[] vals, T v) {
		int count = 0;

		for (int i = 0; i < vals.length; i++) {
			if (vals[i] == v)
				count++;
		}

		return count;
	}
}

public class LambdaExpressionDemo7 {

	static <T> void calculate(CountDuplicates<T> countDuplicates, T[] vals, T v) {
		int count = countDuplicates.countMatching(vals, v);

		if (count > 0) {
			System.out.println(v + " Found : " + count + " times");
		} else {
			System.out.println("Not found");
		}
	}

	public static void main(String[] args) {

		Integer[] integers = { 1, 3, 1, 2, 1, 4, 5, 4, 5, 7, 8, 4, 6 };

		String[] strings = { "one", "two", "one" };

//		Passing method reference for Integer
		CountDuplicates<Integer> countDupsInts = DuplicateCounter::<Integer>countDups;

		LambdaExpressionDemo7.calculate(countDupsInts, integers, 4);

//		Compile time exception: Due to generics
//		LambdaExpressionDemo7.calculate(countDups, strings, "one");

//		Passing method reference for String
		CountDuplicates<String> countDupsStrs = DuplicateCounter::<String>countDups;
		LambdaExpressionDemo7.calculate(countDupsStrs, strings, "one");
	}

}
