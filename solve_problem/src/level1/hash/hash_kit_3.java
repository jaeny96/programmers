package level1.hash;

import java.util.HashMap;

public class hash_kit_3 {
	public static void main(String[] args) {
		String[][] clothes = { { "yellowhat", "headgear" }, 
				{ "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		int res = solution(clothes);
		System.out.println(res);
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String[] arr : clothes) {
			map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
		}
		
		for(int i : map.values()) {
			answer *=(i+1);
		}
		return answer-1;
	}
}
