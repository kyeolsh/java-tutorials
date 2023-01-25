package org.opentutorials.javatutorials.practice;

public class Practice04 {

	public static void main(String[] args) {
        String a = "write once, run anywhere";
        int num = 0;
        int sum = 0;
        
        /* Q1 : 출력값 예측하기 >> everywhere */
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
		}
        
        System.out.println("----");
        
        /* Q2 : 3의 배수의 합*/
        while(num < 1000) {
        	num++;
        	if(num % 3 == 0) 
        		sum += num;
        }
        System.out.println("sum >> " + sum);
        
        System.out.println("----");
        
        /* Q3 : while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자. */
        for(int i = 1; i < 6; i++) {
        	for(int j = 0; j < i; j++)
        		System.out.print("*");
        	System.out.println();
        }
        
        System.out.println("----");
        
        /* Q4 : 1부터 100까지 출력하기 */
        for(int i = 1; i < 101; i++) {
        	System.out.println(i);
        }
        
        System.out.println("----");
        
        /* Q5 : 평균점수 구하기 */
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        sum = 0;
        
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / marks.length;
        System.out.println(average);
        
	}

}