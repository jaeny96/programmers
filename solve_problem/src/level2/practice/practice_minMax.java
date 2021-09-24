package level2.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice_minMax {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		List<Integer> list = new ArrayList<>();
		String[] str = s.split(" ");
		for(String a : str) {
			int tmp=0;
			if(a.charAt(0)=='-') {
				tmp=Integer.parseInt(a.replace("-", ""))*-1;
			}else {
				tmp=Integer.parseInt(a);
			}
			list.add(tmp);
		}

		return Collections.min(list) + " " + Collections.max(list);
	}
}
