//핸드폰번호 가리기
package level1.practice;

public class practice_hideCellPhoneNumber {

	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	public static String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++) {
        	answer+="*";
        }
        answer+=phone_number.substring(phone_number.length()-4);
        return answer;
    }
}
