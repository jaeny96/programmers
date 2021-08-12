//두 개 뽑아서 더하기
package level1.monthChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class monthChallenge_takeTwoAndAdd {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		for(int a : solution(numbers)) {
			System.out.println(a);
		}

	}

    public static int[] solution(int[] numbers) {
        List<Integer> sumList = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		if(!sumList.contains(numbers[i]+numbers[j])) {
        			sumList.add(numbers[i]+numbers[j]);
        		}
        		
        	}
        }
        Collections.sort(sumList);
        int[] answer = new int[sumList.size()];
        for(int i=0; i<sumList.size(); i++) {
        	answer[i] = sumList.get(i);
        }
        
        return answer;
    }
}
