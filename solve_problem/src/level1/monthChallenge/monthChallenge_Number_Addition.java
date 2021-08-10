package level1.monthChallenge;

public class monthChallenge_Number_Addition {
	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		System.out.println(solution(left,right));
		
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for(int i=left; i<=right; i++) {
			if(measure(i)%2==0) {
				answer+=i;
			}else {
				answer=answer+(i*-1);
			}
		}
		return answer;
	}

	public static int measure(int number) {
		int count = 0;
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		return count;
	}
}
