//튜플
package level2.kakao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class kakao_tuple {

	public static void main(String[] args) {
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		for (int i : solution(s)) {
			System.out.println(i);
		}
	}

	public static int[] solution(String s) {
		//결과값을 담을 q 변수 선언
		Queue<String> q = new LinkedList<>();
		//앞뒤 {{ }} 제거
		String newS = s.substring(2, s.length() - 2);
		//},{값을 /로 대체
		newS = newS.replace("},{", "/");
		String[] strArr = newS.split("/");

		//sort의 기준을 문자열 길이로 잡음
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

		for (String str : strArr) {
			String[] tmp = str.split(",");
			for (int i = 0; i < tmp.length; i++) {
				//q에 tmp[i]가 없을때 q에 추가
				if (!q.contains(tmp[i])) {
					q.offer(tmp[i]);
				}
			}
		}

		//answer값을 q의 사이즈만큼 할당
		int[] answer = new int[q.size()];
		//answer에 값 넣어주기
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(q.poll());
		}

		return answer;
	}
}
