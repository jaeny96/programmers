//땅따먹기
package level2.practice;

import java.util.Arrays;

public class practice_eatTheGround {

	public static void main(String[] args) {
		int[][] land = { { 4, 3, 2, 1 }, { 2, 2, 2, 1 }, { 6, 6, 6, 4 }, { 8, 7, 6, 5 } };
		System.out.println(solution(land));
	}

	static int solution(int[][] land) {
		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < land[i - 1].length; k++) {
					if (j == k) {
						continue;
					} else {
						sum = Math.max(sum, land[i - 1][k]);
					}
				}
				land[i][j] += sum;
			}
		}

		
		return Arrays.stream(land[land.length-1]).max().getAsInt();
	}
}
