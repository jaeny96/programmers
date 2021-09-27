package level2.practice;

public class practice_fibonacci {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int[] numbers = new int[n + 1];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 1;

		for (int i = 3; i <= n; i++) {
			numbers[i] = (numbers[i - 2] + numbers[i - 1])%1234567;
		}

		return numbers[n];
	}

}
