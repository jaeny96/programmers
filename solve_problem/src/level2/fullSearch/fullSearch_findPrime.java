//소수 찾기
package level2.fullSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class fullSearch_findPrime {

	public static void main(String[] args) {
		String numbers = "17";
		System.out.println(solution(numbers));

	}

	static HashSet<String> set;

	public static int solution(String numbers) {
		int answer = 0;

		// 순열 돌릴 list
		List<Integer> nums = new ArrayList<>();
		for (char c : numbers.toCharArray()) {
			nums.add(Integer.parseInt(c + ""));
		}
		// 순열 결과값
		int[] result = new int[numbers.length()];
		// 방문 여부
		boolean[] chk = new boolean[numbers.length()];

		// real결과값 저장 set
		set = new HashSet<>();

		// 1~n개의 순열 경우의 수 구하기
		for (int i = 1; i <= numbers.length(); i++) {
			permutation(nums, result, chk, 0, numbers.length(), i);
		}

		// string to int
		List<Integer> tmp = new ArrayList<>();
		for (String l : set) {
			if (!"".equals(l)) {
				tmp.add(Integer.parseInt(l));
			}
		}

		// 소수 판별
		for (int i : tmp) {
			if (prime(i)) {
				answer++;
			}
		}
		return answer;
	}

	// 소수판별 함수
	public static boolean prime(int number) {
		// number의 루트값까지 확인하는 로직
		// 시간복잡도 O(루트number)
		if (number != 1) {
			for (int i = 2; i * i <= number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	// 순열 - 백트래킹 방법
	public static void permutation(List<Integer> numbers, int[] result, boolean[] chk, int depth, int n, int r) {
		if (depth == r) {
			combi(result, r);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (chk[i] != true) {
				chk[i] = true;
				result[depth] = numbers.get(i);
				permutation(numbers, result, chk, depth + 1, n, r);
				chk[i] = false;
			}
		}
	}

	// 배열 list에 삽입
	static void combi(int[] arr, int r) {
		String tmp = "";
		for (int i = 0; i < r; i++)
			if (arr[0] != 0) {
				tmp += arr[i];
			}
		set.add(tmp);
	}
}
