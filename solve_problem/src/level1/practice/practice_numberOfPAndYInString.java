//문자열 내 p와 y의 개수
package level1.practice;

public class practice_numberOfPAndYInString {

	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
    static boolean solution(String s) {
        int cntP=0;
        int cntY=0;
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
        	if('p'==s.charAt(i)) {
        		cntP+=1;
        	}
        	if('y'==s.charAt(i)) {
        		cntY+=1;
        	}
        }
        if(cntP==cntY) {
        	return true;
        }else {
        	return false;
        }
    }
	

}
