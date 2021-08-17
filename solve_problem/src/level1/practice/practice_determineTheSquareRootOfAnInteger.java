//정수 제곱근 판별
package level1.practice;

public class practice_determineTheSquareRootOfAnInteger {

	public static void main(String[] args) {
		long n = 3;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n)%1==0) {
        	answer=(long)Math.pow(Math.sqrt(n)+1, 2);
        }else {
        	answer= -1;
        }
        return answer;
    }
}
