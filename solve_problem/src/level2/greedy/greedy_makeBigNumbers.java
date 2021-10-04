//큰 수 만들기
//좀 더 생각해봐야하는 문제!
package level2.greedy;

public class greedy_makeBigNumbers {

	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		System.out.println(solution(number, k));
	}

	public static String solution(String number, int k) {
		StringBuilder sb = new StringBuilder();
		int idx = 0, max = 0;
		
		// number.length()-k만큼 뽑을 예정임
		for (int i = 0; i < number.length() - k; i++) {
			max = 0;
			for (int j = idx; j <= i + k; j++) {
				// number.charAt(j)-'0' : Integer로 변경하는 구문
				if (max < number.charAt(j) - '0') {
					max = number.charAt(j) - '0';
					idx = j + 1;
				}
			}
			sb.append(max);
		}

		return sb.toString();
	}
}
