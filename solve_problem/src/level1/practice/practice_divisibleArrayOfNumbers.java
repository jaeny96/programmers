//나누어 떨어지는 숫자 배열
package level1.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice_divisibleArrayOfNumbers {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		for(int i : solution(arr,divisor)) {
			System.out.println(i);
		}
	}
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
        	if(i%divisor==0) {
        		list.add(i);
        	}
        }
        
        if(list.size()==0) {
        	list.add(-1);
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        return answer;
    }
}
