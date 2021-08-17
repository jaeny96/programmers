//수박수박수박수박수박수?
package level1.practice;

public class practice_subak {

	public static void main(String[] args) {
		int n=3;
		System.out.println(solution(n));
	}
    public static String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++) {
        	if(i%2==0) {
        		answer+="수";
        	}else {
        		answer+="박";        		
        	}
        }
        return answer;
    }
}
