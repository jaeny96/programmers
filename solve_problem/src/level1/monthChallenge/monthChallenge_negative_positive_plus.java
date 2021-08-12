//음양 더하기
package level1.monthChallenge;

public class monthChallenge_negative_positive_plus {

	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(solution(absolutes,signs));

	}
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++) {
        	if(!signs[i]) {
        		absolutes[i]=absolutes[i]*(-1);
        	}
        }
        for(int i : absolutes) {
        	answer+=i;
        }
        return answer;
    }
}
