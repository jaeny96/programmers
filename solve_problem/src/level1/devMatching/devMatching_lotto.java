package level1.devMatching;

public class devMatching_lotto {

	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		for (int i : solution(lottos, win_nums)) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		int min_cnt = 0;
		int max_cnt = 0;
		for (int l : lottos) {
			for (int w : win_nums) {
				if (l == w) {
					min_cnt++;
					max_cnt++;
				}
			}
			if (l == 0) {
				max_cnt++;
			}
		}
		if(max_cnt==0) {
			max_cnt=1;
		}
		if(min_cnt==0) {
			min_cnt=1;
		}
		
		answer[0]=7-max_cnt;
		answer[1]=7-min_cnt;

		return answer;
	}
}
