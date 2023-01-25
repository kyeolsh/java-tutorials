package org.opentutorials.javatutorials.practice;
import java.util.*;

public class Practice03 {
	
	enum CoffeeType {
	    AMERICANO,
	    ICE_AMERICANO,
	    CAFE_LATTE
	}
	
	public static void main(String[] args) {
		
		/* Q1. 평균점수 구하기 */
		int[] rate = {80, 75, 55};
		int sum = 0;
		for(int i = 0 ;i < rate.length; i++) {
			sum += rate[i];
		}
		System.out.println("Q1 >> " + sum / rate.length);
		
		/* Q2. 홀수 짝수 판별 */
		if(13 % 2 == 0) {
			System.out.println("Q2 >> "+ " 13은 짝수입니다.");
		} else {
			System.out.println("Q2 >> "+ "13은 홀수입니다.");
		}
		
		/* Q3. 주민등록번호 나누기 */
		String pin = "881120-1068234";
		String year = "19" + pin.substring(0,2);
		String month = pin.substring(2,4);
		String day = pin.substring(4,6);
		System.out.println("Q3 >> " + year + month + day);

		/* Q4. 주민등록번호 인덱싱 */
		if(pin.charAt(7) == '1') {
			System.out.println("Q4 >> " + "남자 입니다.");
		} else {
			System.out.println("Q4 >> " + "자 입니다.");
		}
		
		/* Q5. 문자열 바꾸기 */
		String a = "a:b:c:d";
		System.out.println("Q5 >> " + a.replace(':', '#'));
		
		/* Q6. 리스트 역순 정렬하기 */
        ArrayList<Integer> myList1 = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        //System.out.println(myList1); // [1, 3, 5, 4, 2] 출력
        myList1.sort(Comparator.reverseOrder());
        System.out.println("Q6 >> " + myList1);
		
		/* Q7. 리스트를 문자열로 만들기 */
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        // System.out.println(myList2); // [Life, is, too, short] 출력
        String result = "";
        
        for(int i = 0; i < myList2.size(); i++) {
        	result+= myList2.get(i);
        	result+= " ";
        }
        System.out.println("Q7 >> " + result);
        
		/* Q8. 맵에서 값 추출하기 */
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        grade.remove("B");
        System.out.println("Q8 >> " + grade);
		
		/* Q9. 중복 숫자 제거하기 */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        // System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        HashSet<Integer> newHashSet = new HashSet<>(numbers);
        System.out.println("Q9 >> " + newHashSet);
		
		/* Q10. 매직넘버 제거하기 */
        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
        // printCoffeePrice(99);  // NullPointerException 발생

	}
	
    static void printCoffeePrice(CoffeeType type) {
    	
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("Q10 >> " + "가격은 %d원 입니다.", price));
    }

}
