//자연수 뒤집어 배열로 만들기
package level1.practice;

import java.util.ArrayList;
import java.util.List;

public class practice_flipNaturalNumbersToFormAnArray {

	public static void main(String[] args) {
		long n = 12345;
		for(int i : solution(n)) {
			System.out.println(i);
		}
	}
    public static int[] solution(long n) {
    	List<Integer> list = new ArrayList<>();
    	while(n!=0) {
    		list.add((int)(n%10));
    		n=n/10;
    	}
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i]=(int)list.get(i);
        }
        return answer;
    }
}
