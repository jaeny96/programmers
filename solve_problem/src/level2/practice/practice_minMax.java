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
			//양수,음수 판별하여 형변환 한후 numbers에 대입
			if (str[i].charAt(0) == '-') {
				numbers[i] = Integer.parseInt(str[i].replace("-", "")) * -1;
			} else {
				numbers[i] = Integer.parseInt(str[i]);
			}
		}
		//정렬
		Arrays.sort(numbers);
		//정렬 후 첫번째 원소, 마지막 원소 반환
		return numbers[0] + " " + numbers[numbers.length - 1];
	}
}
