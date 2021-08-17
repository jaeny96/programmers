//문자열 다루기 기본
package level1.practice;

public class practice_stringHandlingBasics {

	public static void main(String[] args) {
		String s = "a234";
		System.out.println(solution(s));
	}
	
    public static boolean solution(String s) {
        try {
        	if(s.length()==4 || s.length()==6) {
        		Integer.parseInt(s);        		
        		return true;
        	}else {
        		return false;
        	}
        }catch (NumberFormatException e) {
        	return false;
		}
    }
}
