//타겟 넘버
package level1.dfs_bfs;

public class dfs_bfs_kit_1 {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target) {
		int answer = 0;
		answer += dfs(numbers, target, 1, numbers[0]);
		answer += dfs(numbers, target, 1, (-1) * numbers[0]);

		return answer;
	}

	public static int dfs(int[] numbers, int target, int index, int prevSum) {
		if (index == numbers.length) {
			if (prevSum == target) {
				return 1;
			}
			return 0;
		}

		int pCur = prevSum + numbers[index];
		int mCur = prevSum - numbers[index];

		int answer = 0;
		answer += dfs(numbers, target, index + 1, pCur);
		answer += dfs(numbers, target, index + 1, mCur);

		return answer;
	}
}
