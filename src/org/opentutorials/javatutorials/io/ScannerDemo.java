package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자가 입력한 값
		int i = sc.nextInt();

		/* 1단부터 i단까지 구구단 만들기 */
		for(int j = 1; j < i + 1 ; j++) {
			for(int x = 1; x < 10; x++) {
				System.out.printf("%d x %d = %d", j, x, j*x);
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}
