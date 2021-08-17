//소수 찾기
package level1.practice;

public class practice_findDecimals {

	public static void main(String[] args) {
		int n =5;
		System.out.println(solution(n));

	}
    public static int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++) {
        	if(decimal(i)) {
        		answer+=1;
        	}
        }
        return answer;
    }
    
    //소수 판별 함수
    public static boolean decimal(int number) {
    	boolean b = true;
    	for(int i=2; i<=Math.sqrt(number); i++) {
    		if(number%i==0) {
    			return false;
    		}
    	}
    	
    	return b;
    }
}
