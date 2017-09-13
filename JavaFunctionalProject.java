package io.javabrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaFunctionalProject{
	
	public static boolean isGreaterThan3(int number) {
		return number>3;
	}
	
	
	public static boolean isEven(int number) {
		return number%2==0;
	}
	
	public static int doubleNumber(int number) {
		return number*2;
	}
	
	public static void main() {
		
		List<Integer> values=Arrays.asList(1,2,3,5,4,6,7,8,9,10);
		
		Function<Integer,Predicate<Integer>> isGreaterThan=pivot->number->number>pivot;
		
		
		System.out.println(values.stream()
				.filter(isGreaterThan.apply(3))
				.filter(JavaFunctionalProject::isEven)
				.map(JavaFunctionalProject::doubleNumber)
				.findFirst());
	}
	
	
	
}
