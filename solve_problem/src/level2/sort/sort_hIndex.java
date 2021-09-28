package level2.sort;

import java.util.Arrays;

public class sort_hIndex {
	public static void main(String[] args) {
		int[] citations = { 4, 0, 6, 1, 5 };
		System.out.println(solution(citations));
	}

	public static int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			int hidx = citations.length - i;
			if (hidx <= citations[i]) {
				answer = hidx;
				break;
			}
		}
		return answer;
	}
}
