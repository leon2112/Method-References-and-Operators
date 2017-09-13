package io.javabrains;

import java.util.Arrays;
import java.util.List;

public class JavaFunctionalProject2{
	
	public static boolean isGreaterThan3(int number) {
		return number>3;
	}
	
	
	public static boolean isEven(int number) {
		return number%2==0;
	}
	
	public static void main() {
		
		List<Integer> values=Arrays.asList(1,2,3,5,4,6,7,8,9,10);
		
		
		System.out.println(values.stream()
				.filter(e->e>3).
				filter(e->e%2==0).
				map(e->e*2).
				findFirst());
	}
	
	
	
}
