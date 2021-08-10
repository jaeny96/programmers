package level1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort_kth_number {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] res = solution(array, commands);

		for (int i : res) {
			System.out.print(i+" ");
		}

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		//자르는 범위 담는 List
		List<int[]> list = new ArrayList<int[]>();
		//k번째 수 가리키는 숫자 담는 List
		List<Integer> tmp = new ArrayList<Integer>();
		
		// 자르는 범위 가리키는 숫자 및 k번째 수 가리키는 숫자 나눠서 저장
		for (int i = 0; i < commands.length; i++) {
			tmp.add(commands[i][2]);
			int[] temp = new int[2];
			for (int j = 0; j < commands[i].length - 1; j++) {
				temp[j] = commands[i][j];
			}
			list.add(temp);
		}

		//범위 만큼 자른 array 담는 List
		List<int[]> a = new ArrayList<int[]>();

		//자른 후 정렬한 다음 a에 담는 과정
		for (int j = 0; j < list.size(); j++) {
			List<Integer> aa = new ArrayList<Integer>();
			for (int k = list.get(j)[0] - 1; k < list.get(j)[1]; k++) {
				aa.add(array[k]);
			}
			Collections.sort(aa);
			a.add(aa.stream().mapToInt(i->i).toArray());
		}

		//k번째 수 answer에 담는 과정
		for(int i=0; i<a.size(); i++) {
			answer[i]=a.get(i)[tmp.get(i)-1];
		}

		return answer;
	}

}
