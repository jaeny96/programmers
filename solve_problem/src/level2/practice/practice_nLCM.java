//N개의 최소공배수
package level2.practice;

public class practice_nLCM {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 8, 14 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		// tmp : 최소공배수 담을 변수, gcd : 최대공약수 담을 변수
		int tmp = arr[0], gcd = 0;
		for (int i = 1; i < arr.length; i++) {
			// tmp와 arr[i]원소의 최대공약수 구하기
			gcd = gcd(tmp, arr[i]);
			// tmp와 arr[i]의 최소 공배수 = tmp * arr[i] / (tmp와 arr[i]의 최대공약수)
			tmp = (tmp * arr[i]) / gcd;
		}
		return tmp;
	}

	// 최대 공약수 구하는 함수
	static int gcd(int a, int b) {
		int tmp = 0;
		while (b != 0) {
			tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}
}
