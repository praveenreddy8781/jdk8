package java8.defaultmethods;

interface Calculator {
	int add(int x, int y);

	int substract(int x, int y);

	int multiply(int x, int y);

	int divide(int x, int y);

//	int powerOf2(int x);

	default int powerOf2(int x) {
		System.out.println("Default implementation of power");
		return x * x;
	}
}

public class DefaultmethodsDemo implements Calculator {

	public static void main(String[] args) {
		DefaultmethodsDemo calculator = new DefaultmethodsDemo();
		System.out.println("add(10, 20): " + calculator.add(10, 20));
		System.out.println("substract(10, 20): " + calculator.substract(10, 20));
		System.out.println("multiply(10, 20): " + calculator.multiply(10, 20));
		System.out.println("divide(10, 20): " + calculator.divide(10, 20));
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int substract(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}

}
