package java8.aannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Type Annotations Examples

//A marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface TypeAnno {

}

//A marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {

}

//A marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface Unique {

}

//A annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface MaxLen {
	int value();
}

//A annotation that can be applied to a TYPE_PARAMETER
@Target(ElementType.TYPE_PARAMETER)
@interface What {
	String description();
}

//A marker annotation that can be applied to a FIELD
@Target(ElementType.FIELD)
@interface EmptyOK {

}

//A marker annotation that can be applied to a METHOD
@Target(ElementType.METHOD)
@interface Recommanded {

}

public class AnnotaionDemo1<@What(description = "Generic data type") T> {

	@TypeAnno
	String str;

	@EmptyOK
	String test;

	public @Unique AnnotaionDemo1() {
		// TODO Auto-generated constructor stub
	}

	public int f(@TypeAnno AnnotaionDemo1<T> this, int x) {
		return 10;
	}

//	Cant annotate a return type if void
//	public @TypeAnno void f(int j, int k) {
//		return j + k;
//	}

	public @TypeAnno Integer f2(int j, int k) {
		return j + k;
	}

	public @Recommanded Integer f3(int j, int k) {
		return j + k;
	}

	public void f4() throws @TypeAnno NullPointerException {

	}

	String @MaxLen(10) [] @NotZeroLen [] w;

	@TypeAnno
	Integer [] arr;

	public static void myMethod(int i) {
		AnnotaionDemo1<@TypeAnno Integer> annotaionDemo1 = new AnnotaionDemo1<@TypeAnno Integer>();

		@Unique
		AnnotaionDemo1<@TypeAnno Integer> annotaionDemo2 = new @Unique AnnotaionDemo1<@TypeAnno Integer>();

		Object  x = Integer.valueOf(10);
		Integer y;

		y = (@TypeAnno Integer) x;
	}

	public static void main(String[] args) {
		myMethod(10);
	}

}

class SomeClass extends @TypeAnno AnnotaionDemo1<Boolean> {

}
