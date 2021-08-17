package codingTest.mailplug;

public class problem2 {

	public static void main(String[] args) {
		String p = "00000000000000000000";
		String s = "91919191919191919191";
		System.out.println(solution(p, s));
	}

	public static int solution(String p, String s) {
		int answer = 0;
		int[] curr_arr = new int[p.length()];
		int[] correct_arr = new int[p.length()];

		for (int i = 0; i < p.toCharArray().length; i++) {
			curr_arr[i] = Integer.parseInt(p.toCharArray()[i] + "");
		}
		for (int i = 0; i < s.toCharArray().length; i++) {
			correct_arr[i] = Integer.parseInt(s.toCharArray()[i] + "");
		}

		
		for (int i = 0; i < curr_arr.length; i++) {
			
			int forward = (correct_arr[i] - curr_arr[i]) < 0 ? (correct_arr[i] + 10) - curr_arr[i]
					: correct_arr[i] - curr_arr[i];
			int reverse = (curr_arr[i] - correct_arr[i]) < 0 ? (curr_arr[i]+10) - correct_arr[i]
					: curr_arr[i] - correct_arr[i];
			
			if (forward < reverse) {
				answer += forward;
			} else {
				answer += reverse;
			}

		}
		return answer;
	}
}
