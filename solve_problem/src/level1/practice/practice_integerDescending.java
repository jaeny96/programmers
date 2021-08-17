//정수 내림차순으로 배치하기
package level1.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice_integerDescending {

	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
    public static long solution(long n) {
        String str = "";
        List<Character> list = new ArrayList<>();
        for(char c : Long.toString(n).toCharArray()) {
        	list.add(c);
        }
        Collections.sort(list);
        for(int i=list.size()-1; i>-1; i--) {
        	str += list.get(i);
        }
        return Long.parseLong(str);
    }
}
