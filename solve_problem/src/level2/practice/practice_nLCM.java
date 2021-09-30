//N개의 최소공배수
package level2.practice;

public class practice_nLCM {

	public static void main(String[] args) {
		int[] arr = { 2,6,8,14 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int tmp = arr[0], gcd = 0;
		for (int i = 1; i < arr.length; i++) {
			gcd = gcd(tmp, arr[i]);
			System.out.println(tmp+"*"+arr[i]+"="+(tmp*arr[i])/gcd);
			tmp = (tmp*arr[i])/gcd;
		}
		return tmp;
	}

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
