//괄호변환
package level2.kakao;

public class kakao_bracketConversion2 {

	public static void main(String[] args) {
		String p = "()))((()";
		System.out.println(solution(p));
	}

	public static String solution(String p) {
		// 문자열이 빈칸인 경우 빈칸 반환
		if ("".equals(p)) {
			return "";
		}

		StringBuilder answer = new StringBuilder();
		StringBuilder u = new StringBuilder();
		StringBuilder v = new StringBuilder();
		int idx = seperate(p);
		u.append(p.substring(0, idx + 1));
		v.append(p.substring(idx + 1));

		// u의 값이 올바른 괄호 문자열일 경우 v에 대해 1단계부터 수행 후 u에 이어붙인 값을 반환
		if (isCorrect(u.toString())) {
			answer.append(u + solution(v.toString()));
		} else {
			// 빈문자열에 ( 와 v에대해 재귀적으로 수행한 결과와 )를 붙임
			answer.append("(" + solution(v.toString()) + ")");
			// u의 첫번째, 마지막문자 제거
			u.deleteCharAt(0);
			u.deleteCharAt(u.length() - 1);
			// 변환한 u의 문자열을 뒤집어서 answer 뒤에 붙임
			answer.append(conversion(u.toString()));
		}
		// 생성된 문자열 반환
		return answer.toString();

	}

	// 문자열 분리하는 함수
	static int seperate(String s) {
		char[] cArr = s.toCharArray();
		int open = 0, close = 0, idx = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == '(') {
				open++;
			} else {
				close++;
			}
			// (와 )의 갯수가 같을때 u와 v에 해당하는 값 대입 후 break;
			if (open == close) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	// practice_correctBracket코드 참고
	// 올바른 괄호 문자열인지 확인하는 함수
	static boolean isCorrect(String s) {
		int count = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				count++;
			} else {
				count--;
				if (count < 0) {
					return false;
				}
			}
		}

		if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' || count != 0) {
			return false;
		}
		return true;
	}

	// 괄호 회전하는 함수
	static String conversion(String s) {
		String str = "";
		for (char c : s.toCharArray()) {
			if (c == '(') {
				str += ')';
			} else {
				str += '(';
			}
		}
		return str;
	}
}
