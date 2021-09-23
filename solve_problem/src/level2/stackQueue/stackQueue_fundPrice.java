package level2.stackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stackQueue_fundPrice {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		for (int t : solution(prices)) {
			System.out.println(t);
		}
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stk = new Stack<Integer>();
		for (int p : prices) {
			stk.push(p);
		}

		for (int i = 0; i < stk.size(); i++) {
			int time = 1;
			for (int j = i + 1; j < stk.size(); j++) {
				if (stk.elementAt(i) > stk.elementAt(j) || j == stk.size() - 1) {
					answer[i] = time;
					break;
				} else {
					time++;
				}
			}
		}
		return answer;
	}
	public static int[] solution2(int[] prices) {
		int[] answer = new int[prices.length];
//		Stack<Integer> stk = new Stack<Integer>();
		List<Integer> list = new ArrayList<>();
		for (int p : prices) {
			list.add(p);
		}

		for (int i = 0; i < list.size(); i++) {
			int time = 1;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j) || j == list.size() - 1) {
					answer[i] = time;
					break;
				} else {
					time++;
				}
			}
		}
		return answer;
	}
}
