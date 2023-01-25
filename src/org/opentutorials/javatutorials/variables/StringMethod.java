package org.opentutorials.javatutorials.variables;
import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
		String c = "hello";
		String d = new String("hello");
		
		/* equals */
		System.out.println(a.equals(b)); //false
		System.out.println(a.equals(c)); //true
		System.out.println(a == d); //false
		System.out.println(a == c); //true
		
		/* indexOf */
		String myName = "Shin Seung Hyeon";
		System.out.println(myName.indexOf("Sh")); // 0
		System.out.println(myName.indexOf("Se")); // 5
		
		/* contains */
		String atom = "nice";
		String molecule = "Have a nice day";
		System.out.println(atom.contains("i")); // true
		System.out.println(molecule.contains(atom)); // true
		
		/* charAt */
		String myNumber = "010-4686-6496";
		System.out.println(myNumber.charAt(4)); // 4
		
		/* replaceAll */
		System.out.println(molecule.replaceAll("nice", "good")); //Have a good day
		
		/* substring */
		String myBirth = "19960713";
		System.out.println(myBirth.substring(0,4) + "-" + myBirth.substring(4,6) + "-" + myBirth.substring(6,8)); // 날짜형식으로 생년월일 출력
		
		/* toUpperCase, toLowerCase */
		System.out.println(myName.toUpperCase());
		System.out.println(myName.toLowerCase());
		
		/* split */
		String buttonOption = "Retrieve, New, Save, Delete";
		String[] result = buttonOption.split(", ");
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println(Arrays.toString(result));
	}
}
