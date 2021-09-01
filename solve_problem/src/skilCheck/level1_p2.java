package skilCheck;

import java.util.HashMap;
import java.util.Map;

public class level1_p2 {

	public static void main(String[] args) {
		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		System.out.println(solution(participant,completion));
	}
    public static String solution(String[] participant, String[] completion) {
    	String answer="";
        Map<String, Integer> map = new HashMap<>();
        for(String str : participant) {
        	map.put(str,map.getOrDefault(str, 0)+1);
        }
        for(String str : completion) {
        	map.put(str, map.get(str)-1);
        }

        for(String str : map.keySet()) {
        	if(map.get(str)!=0) {
        		answer=str;
        	}
        }
		return answer;
	}
}
