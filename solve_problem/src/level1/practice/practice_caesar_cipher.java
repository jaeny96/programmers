//시저 암호
package level1.practice;

public class practice_caesar_cipher {

	public static void main(String[] args) {
		String s = "Z";
		int n = 10;
		System.out.println(solution(s, n));
	}

	public static String solution(String s, int n) {
		String answer = "";
		for (char c : s.toCharArray()) {
			int test = 0;
			if (c != ' ') {
				test = c + n;
				if (Character.isUpperCase(c)) {
					if (test > 90) {
						test = test - 26;
					}
				} else {
					if (test > 122) {
						test = test - 26;
					}
				}
				answer += (char) test;
			} else {
				answer += c;
			}
		}
		return answer;
	}
}
