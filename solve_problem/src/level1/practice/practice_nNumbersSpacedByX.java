//x만큼 간격이 있는 n개의 숫자
package level1.practice;

public class practice_nNumbersSpacedByX {

	public static void main(String[] args) {
		long x = 2;
		int n = 5;
		
		for(long l : solution(x,n)) {
			System.out.println(l);
		}

	}
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++) {
        	answer[i] = x*(i+1);
        }
        return answer;
    }
}
