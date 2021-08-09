package hash;

import java.util.HashMap;

public class hash_kit_1 {
	public static void main(String[] args) {
		String[] participant ={"mislav", "stanko", "mislav", "ana"};
		String[] completion ={"stanko", "ana", "mislav"};
		
		String res = solution(participant,completion);
		System.out.println(res);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer="";
		HashMap<String,Integer> map = new HashMap<String, Integer>();
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
