package level1.programmingMaster;

import java.util.ArrayList;
import java.util.List;

public class programmingMaster_pokemon {

	public static void main(String[] args) {
		int[] nums = { 3,3,3,2,2,2 };
		System.out.println("answer : " + solution(nums));
	}

	public static int solution(int[] nums) {
		int r = nums.length / 2;

		List<Integer> list = new ArrayList<Integer>();

		for (int i : nums) {
			//list size 제한 + 중복 제거한 값 추가
			if (!list.contains(i) && list.size()<r) {
				list.add(i);
			}
		}
		//만일 중복제거한 list의 사이즈가 r보다 작을경우 다시 추가해주기
		if (list.size() < r) {
			for (int i : nums) {
				if (list.size() == r) {
					break;
				}
				list.add(i);
			}
		}
		
		//다시 한번 중복 제거하여 종류 수 구하기
		List<Integer> tmp = new ArrayList<Integer>();
		for (int i : list) {
			if (!tmp.contains(i)) {
				tmp.add(i);
			}
		}

		return tmp.size();
	}
}
