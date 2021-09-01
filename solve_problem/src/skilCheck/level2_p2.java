package skilCheck;

import java.util.ArrayList;
import java.util.List;

public class level2_p2 {

	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};

		for(String str : solution(orders,course)) {
			System.out.println(str);
		}
	}
    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        List<String> list = new ArrayList<>(); 
        for(int i=0; i<orders.length; i++) {
        	for(int j=0; j<orders[i].length()-1; j++) {
        		for(int k=j+1; k<orders[i].length(); k++) {
        			list.add((orders[i].charAt(j)+"")+(orders[i].charAt(k)+""));
        		}
        	}
        }
        for(String str : list) {
        	System.out.println(str);
        }
        return answer;
    }
}
