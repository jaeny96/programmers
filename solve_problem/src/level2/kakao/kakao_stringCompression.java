//문자열 압축
package level2.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class kakao_stringCompression {

	public static void main(String[] args) {
		String s = "aabbaccc";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
        if(s.length()==1){
            return 1;
        }
    	List<Integer> length = new ArrayList<>();
		for (int i = 1; i <= s.length() / 2; i++) {
			String compress = "";
			String curr = "";
			String next = "";
			int num = 1;
			for (int j = 0; j <= s.length() / i; j++) {
				int endIdx = (j + 1) * i > s.length() ? s.length() : (j + 1) * i;
				curr = next;
				next = s.substring(j * i, endIdx);
				if (curr.equals(next)) {
					num += 1;
				} else {
					compress += count(num) + curr;
					num = 1;
				}
			}
			compress += count(num) + next;
			length.add(compress.length());
		}
		
		
		return Collections.min(length);
	}
	
	public static String count(int num) {
		return num<=1 ? "" : num+"";
	}
}
