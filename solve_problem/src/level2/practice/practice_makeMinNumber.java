package level2.practice;

import java.util.Arrays;

public class practice_makeMinNumber {

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		System.out.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0, bIdx=B.length-1;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[bIdx];
			bIdx--;
		}
		return answer;
	}
}
