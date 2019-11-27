package java8.lambdaexpressions;

class EmptyArrayException extends Exception {
	public EmptyArrayException(){
		super("Array is empty!!!!!!s");
	}
}

interface SumElementsOfArray {
	int sum(int[] arr) throws EmptyArrayException;
}

public class LambdaExpressionDemo4 {

	public static void main(String[] args) {
//		Create an lambda expression to sum all the elements of array
		SumElementsOfArray sumElementsOfArray = (int arr[]) -> {

			if (arr.length == 0)
				throw new EmptyArrayException();

			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		};

//		calling lambda expression
//		int[] arr = {1,2,3,4,5,6};
		
		int[] arr = {};
		
		int sum;
		try {
			sum = sumElementsOfArray.sum(arr);
			System.out.println(sum);
		} catch (EmptyArrayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
