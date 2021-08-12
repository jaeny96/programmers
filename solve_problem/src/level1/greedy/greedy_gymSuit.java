//체육복
package level1.greedy;

public class greedy_gymSuit {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = { 1,2 };
		int[] reserve = { 2,3};

		int res = solution(n, lost, reserve);
		System.out.println(res);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int cnt = 0;
		
		//lost[] 諛곗뿴 媛믨낵 reserve[] 諛곗뿴媛� 鍮꾧탳�븯�뿬 媛숈� 媛� �젙�젣
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i]==reserve[j]) {
					lost[i]=-1;
					reserve[j]=-1;
				}
			}
		}
		
		//lost[] 諛곗뿴 媛믨낵 reserve[] 諛곗뿴媛� 鍮꾧탳�빐 +1,-1 �굹�삤�뒗 �빐�떦 �씤�뜳�뒪 媛� �젙�젣
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (Math.abs(lost[i] - reserve[j]) == 1) {
					reserve[j]=-2;
					lost[i]=-2;
					break;
				}
			}
		}
		
		//�뜲�씠�꽣媛� �젙�젣�릺吏� �븡�� lost媛� 媛쒖닔 寃��깋
		for(int i:lost) {
			if(i>-1) {
				cnt++;
			}
		}
		
		return answer-cnt;
	}
}
