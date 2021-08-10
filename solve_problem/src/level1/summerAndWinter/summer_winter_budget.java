package level1.summerAndWinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class summer_winter_budget {

	public static void main(String[] args) {
		int[] d= {1,3,2,5,4};
		int budget=9;
		System.out.println(solution(d,budget));
	}
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int temp=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i:d) {
        	list.add(i);
        }
        //list 정렬
        Collections.sort(list);

        //temp에 더한 값이 budget보다 작을경우 answer 증가
        //아니면 break;
        for(int i:list) {
    		temp+=i;
        	if(temp<=budget) {
        		answer++;
        	}else {
        		break;
        	}
        }
        
        return answer;
    }
}
