//서울에서 김서방 찾기
package level1.practice;

public class practice_findKimInSeoul {

	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };
		System.out.println(solution(seoul));
	}

	public static String solution(String[] seoul) {
		int idx =0;
		for(int i=0; i<seoul.length; i++) {
			if("Kim".equals(seoul[i])) {
				idx=i;
				break;
			}
		}
		return "김서방은 "+idx+"에 있다";
	}
}
