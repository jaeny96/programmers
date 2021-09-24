package level2.practice;

public class practice_nextBigNumber {

	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}

//	public static int solution(int n) {
//		String bn = binaryNumber(n);
//		int originalCnt = count(bn);
//		int nextCnt = 0;
//		while (true) {
//			n++;
//			nextCnt = count(binaryNumber(n));
//			if (nextCnt == originalCnt) {
//				break;
//			}
//		}
//		return n;
//	}
//
//	static String binaryNumber(int n) {
//		StringBuffer sb = new StringBuffer();
//		while (n != 0) {
//			sb.append(n % 2);
//			n = n / 2;
//		}
//		return sb.reverse().toString();
//	}
//
//	static int count(String s) {
//		int cnt = 0;
//		for (char c : s.toCharArray()) {
//			if (c == '1') {
//				cnt++;
//			}
//		}
//		return cnt;
//	}
//
//	static int decimal(String s) {
//		int result = 0, idx = 0, tmp = s.length() - 1;
//		while (idx != s.length()) {
//			result += Math.pow(2, tmp) * Integer.parseInt(s.charAt(idx) + "");
//			idx++;
//			tmp--;
//		}
//		return result;
//	}


	public static int solution(int n) {
		int originalCnt = Integer.bitCount(n);
		int nextCnt = 0;

		while (true) {
			n++;
			nextCnt = Integer.bitCount(n);
			if (originalCnt == nextCnt) {
				break;
			}
		}
		return n;
	}
}
