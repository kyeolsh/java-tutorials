package org.opentutorials.javatutorials.practice;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice06 {

	public static void main(String[] args) {
		/* Q1. 입력숫자의 합 */
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		int first = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int second = sc.nextInt();
//		
//		int result = first + second;
//		System.out.printf("두 수의 합은 %d 입니다.", result);
//		
//		sc.close();
		
		/* Q2. 대문자로 변경하기 */
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("영어 문장을 입력하세요. ");
//			String line = sc.nextLine();
//			if("END".equals(line)) {
//				break;
//			}
//			System.out.println(line.toUpperCase());
//		}
		/* Q3. 오류 수정하기 */
//		try {
//        FileWriter fw = new FileWriter("sample.txt");
//        fw.write("Write once, run anywhere");
//        fw.close();
//
//        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
//        String line = br.readLine();
//        System.out.println(line);  // "Write once, anywhere"가 출력된다.
//        br.close();
//		} catch(IOException e){
//			e.getStackTrace();
//		}
		
		/* Q4. 사용자의 입력을 파일에 저장하기 */
//		try {
//			FileWriter fw = new FileWriter("sample.txt", true);
//			Scanner sc = new Scanner(System.in);
//			System.out.print("문장을 입력하세요! : ");
//			String line = sc.nextLine();
//			fw.write(String.format("\n%s\n", line));
//			fw.close();
//			
//		} catch(IOException e) {
//			e.getStackTrace();
//		}
		
		/* Q5. 파일 내용 바꾸어 저장하기 */
		ArrayList<String> data = new ArrayList<>();
        try {
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        while(true) {
            String line = br.readLine();
            if (line == null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
            data.add(line);
        }
        br.close();
        
        String text = String.join("\n", data);
        
        text = text.replaceAll("python", "java");
        
        FileWriter fw = new FileWriter("sample.txt");
        fw.write(text);
        fw.close();
        
        } catch(FileNotFoundException e) {
        	
        	e.getStackTrace();
        	
        } catch(IOException e) {
        	
        	e.getStackTrace();
        	
        }
	}

}
