package summer_winter;

public class summer_winter_level1_prime_number {
	public static void main(String[] args) {
		int[] nums = { 1,2,7,6,4};

		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		int answer = 0;
		boolean flag=false;
		int temp=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1;j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					temp=nums[i]+nums[j]+nums[k];
					flag=decide(temp);
					//flag가 true이면 소수, false이면 소수 x 
					//소수일때만 answer 값 증가
					if(flag) {
						answer++;
					}
				}
			}
		}
		return answer;
	}

	public static boolean decide(int num) {
		// 소수 구별 boolean 타입 변수 선언
		boolean flag = false;
		// 소수 판별 과정
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
			if (num % i != 0) {
				flag = true;
				continue;
			}
		}
		return flag;
	}

}
