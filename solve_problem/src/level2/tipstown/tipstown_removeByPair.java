//짝지어 제거하기
package level2.tipstown;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tipstown_removeByPair{

	public static void main(String[] args) {
		String s = "baabaa";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		//s의 char배열 넣어줄 변수 선언
		Queue<Character> q = new LinkedList<>();
		//비교할 문자 넣어주는 변수 선언
		Stack<Character> stk = new Stack<>();
		for (char c : s.toCharArray()) {
			q.offer(c);
		}

		while (!q.isEmpty()) {
			//stack이 비어있다면 q의 현재 첫번째 값 넣어주기
			if (stk.isEmpty()) {
				stk.push(q.poll());
			}

			//stack의 peek값과 q의 peek 값이 같다면 두 변수 내에서 값 없애기
			if (q.peek() == stk.peek()) {
				stk.pop();
				q.poll();
			} else { //아니라면, q의 peek값 stk에 push
				stk.push(q.poll());
			}
		}

		//stk가 비어있으면, 모든 문자열이 짝지어 제거된것이므로, 1
		if (stk.isEmpty()) {
			return 1;
		} else { //모든 문자열이 짝지어 제거되지 못했으므로, 0
			return 0;
		}
	}
}
