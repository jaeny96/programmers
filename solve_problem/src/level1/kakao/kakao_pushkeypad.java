//키패드 누르기
package level1.kakao;

import java.util.HashMap;
import java.util.Map;

public class kakao_pushkeypad {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String answer = "LRLLLRLLRRL";
		String temp = solution(numbers, hand);
		System.out.println("answer: " + answer + " temp: " + temp + " ? " + (answer.equals(temp)));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		
		//손가락 종류 및 손가락 위치 저장할 map 선언
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//각 손가락 위치 초기화
		map.put("L", 10);
		map.put("R", 12);
		
		for (int i : numbers) {
			//눌러야 하는 번호가 1,4,7 인 경우
			if (i % 3 == 1) {
				answer += "L";
				map.put("L", i);
			} else if (i % 3 == 0 && i!=0) {	//눌러야 하는 번호가 3,5,9인 경우
				answer += "R";
				map.put("R", i);
			} else {
				//왼손이 출발했을때 거리와 오른손이 출발했을때 거리 계산한 값 저장하는 변수 선언
				int Ldistance = distance(map.get("L"), i);
				int Rdistance = distance(map.get("R"), i);
				
				//거리값이 같으면 주로 사용하는 손으로 설정
				if (Ldistance == Rdistance) {
					answer += hand.substring(0, 1).toUpperCase();
					map.put(hand.substring(0, 1).toUpperCase(), i);
				} else if (Ldistance > Rdistance) { //거리값이 L보다 R이 작으면 오른손으로 설정
					answer += "R";
					map.put("R", i);
				} else { //거리값이 R보다 L이 작으면 오른손으로 설정
					answer += "L";
					map.put("L", i);
				}
			}
		}

		return answer;
	}

	public static int distance(int i, int j) {
		//손가락 위치 혹은 눌러야하는 번호가 0일 경우 초기화
		i = (i == 0) ? 11 : i;
		j = (j == 0) ? 11 : j;
		
		//좌표구하기
		int x = (i - 1) / 3;
		int y = (i - 1) % 3;
		int numX = j / 3;
		int numY = 1;

		//좌표간 거리 계산
		return Math.abs(x - numX) + Math.abs(y - numY);
	}
}
