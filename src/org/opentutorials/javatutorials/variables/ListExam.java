package org.opentutorials.javatutorials.variables;
import java.util.Arrays;

import java.util.*;

public class ListExam{
    public List<String> addArray(String[]arr1, String[]arr2){
        List<String> list = new ArrayList<String>();

        for(String str : arr1){
            list.add(str);    
        }

        for(String str : arr2){
            list.add(str);
        }


        return list;
    }

public static void main(String[] args){
    	ListExam Lem = new ListExam();
    	List<String> list = new ArrayList<String>();
    	ArrayList<Number> iList = new ArrayList();
    	
    	String[] word1 = {"kim"};
    	String[] word2 = {"lee"};

    	list = Lem.addArray(word1, word2);
    	
    	/* String.join("구분자", 리스트객체) > 출력 : kim,lee */
    	String result = String.join(",", list);
    	System.out.println("1 >> " + result);
    	
    	for(int i = 0;  i < list.size() ; i++) {
    		/* list[i]의 value 취득 */
    		System.out.println("2 >> " + list.get(i));
    	}
    	
    	System.out.println("3 >> " + list);
    	
    	/* 자주 사용하는 list 함수 */
    	System.out.println("4 >> " + list.isEmpty());
    }
}