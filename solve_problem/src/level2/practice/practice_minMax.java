//최댓값과 최솟값
package level2.practice;

import java.util.Arrays;

public class practice_minMax {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String[] str = s.split(" ");
		int[] numbers = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			if (str[i].charAt(0) == '-') {
				numbers[i] = Integer.parseInt(str[i].replace("-", "")) * -1;
			} else {
				numbers[i] = Integer.parseInt(str[i]);
			}
		}
		Arrays.sort(numbers);
		return numbers[0] + " " + numbers[numbers.length - 1];
	}
}
