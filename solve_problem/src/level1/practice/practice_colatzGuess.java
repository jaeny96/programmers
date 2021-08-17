//콜라츠 추측
package level1.practice;

public class practice_colatzGuess {

	public static void main(String[] args) {
		int num = 626331;
		System.out.println(solution(num));
	}
    public static int solution(long num) {
        int answer = 0;
        while(num!=1 && answer<500) {
        	if(num%2==0) {
        		num=num/2;
        	}else {
        		num=num*3+1;
        	}
        	answer+=1;
        }
        if(num!=1) {
        	answer=-1;
        }
        return answer;
    }
}
