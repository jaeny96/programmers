package hash;

import java.util.HashMap;

public class hash_kit_2 {
	public static void main(String[] args) {
		String[] phone_book = { "123","456","789" };
		boolean bool = solution(phone_book);
		System.out.println(bool);
	}

	public static boolean solution(String[] phone_book) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String str : phone_book) {
			map.put(str, 1);
		}
		for(String key : map.keySet()) {
			for(String compare : map.keySet()) {
				if(!key.equals(compare)) {
					if(compare.startsWith(key)) return false;
					if(key.startsWith(compare)) return false;					
				}
			}
		}
//		for (int i = 0; i < phone_book.length - 1; i++) {
//			for (int j = i + 1; j < phone_book.length; j++) {
//				if (phone_book[j].startsWith(phone_book[i])) {
//					return false;
//				}
//				if (phone_book[i].startsWith(phone_book[j])) {
//					return false;
//				}
//			}
//		}
		return true;
	}
}
