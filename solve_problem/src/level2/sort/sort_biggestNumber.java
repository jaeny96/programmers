//가장큰수
package level2.sort;

import java.util.Arrays;
import java.util.Comparator;

public class sort_biggestNumber {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(solution(numbers));
	}
    public static String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i=0; i<str.length; i++) {
        	str[i]=numbers[i]+"";
        }
        
        Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//내림차순
				//o1.compareTo(o2) : 앞에서 비교하다 다른 문자열이 나오면 
				//o1-o2순서로 해당 아스키코드 값을 뺀 결과(int)를 리턴
				//-값 : 순서 뒤집기, +값 : 순서 그대로
				System.out.println(o1+"/"+o2+"=>"+(o2+o1)+","+(o1+o2));
				System.out.println((o2+o1).compareTo(o1+o2));
				return (o2+o1).compareTo(o1+o2);
			}
		});
        
        //0중복 시 0으로 반환
        if(str[0].equals("0")) {
        	return "0";
        }
        
        for(String s : str) {
        	answer+=s;
        }
        
        return answer;
    }
}
