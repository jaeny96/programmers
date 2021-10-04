package level2.practice;

public class practice_JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		s = s.toLowerCase();
		for (char c : s.toCharArray()) {
			if (!Character.isDigit(c) && idx == 0) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(c);
			}

			if (' ' == c) {
				idx = 0;
			} else {
				idx++;
			}
		}
		return sb.toString();
	}
}
