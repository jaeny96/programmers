//가장 큰 정사각형 *****
package level2.practice;

public class practice_findBiggestSquare {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 1, 1 }, { 1, 1, 1, 1 } };
		System.out.println(solution(board));
	}

	public static int solution(int[][] board) {
		int answer = 0, row = board.length, col = board[0].length;
		int[][] map = new int[row + 1][col + 1];

		// 배열의 크기를 넓혀야 오류가 나지 않음
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				map[i + 1][j + 1] = board[i][j];
			}
		}

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (map[i][j] != 0) {
					// 왼쪽 옆, 위, 대각선의 min값 구한 후 +1
					map[i][j] = Math.min(Math.min(map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1]) + 1;
					// max값이 answer 즉 변의 길이가 됨
					answer = Math.max(answer, map[i][j]);
				}
			}
		}

		return answer * answer;
	}
}
