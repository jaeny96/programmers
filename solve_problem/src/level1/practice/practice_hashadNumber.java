//하샤드 수
package level1.practice;

public class practice_hashadNumber {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(solution(x));

	}
    public static boolean solution(int x) {
        boolean answer = true;
        int insteadX = x;
        int temp=0;
        
        while(insteadX!=0) {
        	temp+=(insteadX%10);
        	if(insteadX!=0) {
        		insteadX=insteadX/10;        		
        	}
        }
        if(x%temp!=0) {
        	answer=false;
        }
        
        return answer;
    }
}
