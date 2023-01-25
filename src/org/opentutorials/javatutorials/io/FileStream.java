package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileStream {

	public static void main(String[] args) {
		/* txt 파일로 데이터 저장하기 */
		try {
			OutputStream output = new FileOutputStream("out_FileStream.txt");
			String str = "오늘은 1월 22일 설날이에요>_<";
			byte[] by = str.getBytes();
			output.write(by);
			output.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		/* txt 파일 불러오기 */
		try {
			// 파일 객체 생성
			File file = new File("/Users/seunghyeon.shin/eclipse-workspace/javatutorials/out_FileStream.txt");
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			int cur = 0;
			while((cur = file_reader.read()) != -1) {
				System.out.print((char)cur);
			}
			file_reader.close();
		} catch(FileNotFoundException e) {
			e.getStackTrace();
		} catch(IOException e) {
			e.getStackTrace();
		}
		
	}

}
