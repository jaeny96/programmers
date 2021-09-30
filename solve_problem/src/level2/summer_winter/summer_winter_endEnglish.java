package level2.summer_winter;

import java.util.Stack;

public class summer_winter_endEnglish {

	public static void main(String[] args) {
		int n = 5;
		String[] words = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		for (int s : solution(n, words)) {
			System.out.println(s);
		}
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		Stack<String> stk = new Stack<>();
		stk.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			// stk에 word[i]가 있는지 판별 후 있으면 중복 단어이므로 break;
			if (stk.contains(words[i])) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
			stk.add(words[i]);
			// words[i-1]의 마지막글자와 words[i]의 첫글자가 같지 않으면 break;
			if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
		}
		return answer;
	}
}
