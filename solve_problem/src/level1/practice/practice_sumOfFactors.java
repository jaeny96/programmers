//약수의 합
package level1.practice;

public class practice_sumOfFactors {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));

	}
    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+1; i++) {
        	if(n%i==0) {
        		answer+=i;
        	}
        }
        return answer;
    }
}
