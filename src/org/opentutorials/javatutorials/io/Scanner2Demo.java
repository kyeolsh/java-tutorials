package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 입력값이 정수일때 >> 출력*/
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}

}
