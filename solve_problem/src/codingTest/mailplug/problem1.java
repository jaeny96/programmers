package codingTest.mailplug;

public class problem1 {

	public static void main(String[] args) {
		String s = "abebeaedeac";
		System.out.println(solution(s));

	}
    public static int solution(String s) {
        int answer = 0;
        int[] charArr = new int[26];
        for(int i=0; i<s.length(); i++){
        	char c = s.charAt(i);
        	charArr[(int)c-97]++;
        }
        
        for(int i : charArr) {
        	if(i%2!=0) {
        		answer++;
        	}
        }
        	
        return answer;
    }

}
