package skilCheck;

public class level1_p1 {

	public static void main(String[] args) {
		String s = "awed";
		System.out.println(solution(s));
	}
    public static String solution(String s) {
        String answer = "";
        int temp = s.length()/2;
        if(s.length()%2!=0){
            answer = s.substring(temp, temp+1);
        }else{
            answer = s.substring(temp-1,temp+1);
        }
        return answer;
    }
}
