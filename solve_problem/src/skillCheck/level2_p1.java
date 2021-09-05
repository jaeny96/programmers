package skillCheck;

public class level2_p1 {

	public static void main(String[] args) {
		String s = "110010101001";
		for (int i : solution(s)) {
			System.out.println(i);
		}
	}

	public static int[] solution(String s) {
		int[] answer = new int[2];
		int removedZeroCount = 0;
		int count = 0;
		while (s.length() != 1) {
			for (char c : s.toCharArray()) {
				if (c == '0') {
					removedZeroCount += 1;
				}
			}

			s = s.replaceAll("0", "");

			s = changeTwo(s.length());
			count += 1;
		}

		answer[0] = count;
		answer[1] = removedZeroCount;
		
		return answer;
	}

	public static String changeTwo(int tmp) {
		String answer = "";
		while (tmp > 1) {
			answer += tmp % 2;
			tmp = tmp / 2;
		}
		return answer + tmp;
	}
}
