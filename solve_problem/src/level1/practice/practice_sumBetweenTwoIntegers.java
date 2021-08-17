//두 정수 사이의 합
package level1.practice;

public class practice_sumBetweenTwoIntegers {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(solution(a,b));
	}
    public static long solution(int a, int b) {
        long answer = 0;
        if(a!=b) {
        	for(int i=Integer.min(a, b); i<=Integer.max(a, b); i++) {
        		answer+=i;
        	}        	
        }else {
        	answer=a;
        }
        return answer;
    }
}
