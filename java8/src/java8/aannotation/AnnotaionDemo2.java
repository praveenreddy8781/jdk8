package java8.aannotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Repeatable Annotation Example
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = MyRepeatedAnnos.class)
@interface MyRepAnno {
	String str() default "Testing";

	int val() default 9000;
}

//This is the container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	MyRepAnno[] value();
}

public class AnnotaionDemo2 {

	public static void main(String[] args) {
		myMethod();
	}

	// Repeated annotation demo
	@MyRepAnno(str = "First Annotation", val = -1)
	@MyRepAnno(str = "Second Annotation", val = 100)
	public static void myMethod() {
		AnnotaionDemo2 obj = new AnnotaionDemo2();

		Class<?> class1 = obj.getClass();

		try {
			Method method = class1.getMethod("myMethod");

			System.out.println("Using getAnnotation to display repeated annotation");
			Annotation annotation = method.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(annotation);
			
			
//			Using getAnnotationsByType to display repeated annotation
			System.out.println("Using getAnnotationsByType to display repeated annotation");
			Annotation[] annotations = method.getAnnotationsByType(MyRepAnno.class);
			for(Annotation annotation2 :annotations) {
				System.out.println(annotation2);
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
