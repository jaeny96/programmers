package level1.weekly;

public class one_week {

	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}

	public static long solution(int price, int money, int count) {
		long answer = -1;
		int cnt =0;
		for(int i=0; i<count; i++) {
			cnt+=(i+1);
		}
		answer = price*cnt-money;
		if(answer<0) {
			answer=0;
		}
		return answer;
	}

}
