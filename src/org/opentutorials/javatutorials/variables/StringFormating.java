package org.opentutorials.javatutorials.variables;

public class StringFormating {

	public static void main(String[] args) {
		System.out.printf("I eat %d apples ", 3);
		System.out.println(String.format("I eat %d apples", 3));
		// System.out.println("I eat %d apples", 3) -> error : 인수갯수 초과
		
		int number = 5;
		String day = "five";
		System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day ));
		
		/* 정렬과 공백 */
		System.out.println(String.format("%10f", 1.23456));
		System.out.println(String.format("%10.4f", 1.23456));
		System.out.println(String.format("%f", 1.23456));
		
	}

}

