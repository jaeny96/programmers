//제일 작은 수 제거하기
package level1.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice_removeSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1, 5};
		for(int i : solution(arr)) {
			System.out.println(i);
		}
	}
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        //정렬하기 위해 값 대입
        for(int i : arr) {
        	list.add(i);
        }
        //정렬
        Collections.sort(list);
        //arr length가 1일때 -1 처리
        if(arr.length==1) {
        	temp.add(-1);
        }else { //아닐때 최소값 제외 모든 값 대입
        	for(int i : arr) {
        		if(list.get(0)!=i) {
        			temp.add(i);
        		}
        	}
        }
        //temp값 대입
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++) {
        	answer[i]=temp.get(i);
        }
        return answer;
    }
}
