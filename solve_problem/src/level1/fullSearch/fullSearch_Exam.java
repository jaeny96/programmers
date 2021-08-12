//모의고사
package level1.fullSearch;

import java.util.ArrayList;
import java.util.List;

public class fullSearch_Exam {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 5, 5, 2 };
		int[] res = solution(answers);
		for (int i : res) {
			System.out.println("res " + i);
		}
	}

	public static int[] solution(int[] answers) {
		int[] person1 = { 1, 2, 3, 4, 5 };
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] correctCnt= {0,0,0};

		// 留욏엺 媛쒖닔 �솗�씤
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == person1[i%person1.length]) {
				correctCnt[0]++;
			}

			if (answers[i] == person2[i%person2.length]) {
				correctCnt[1]++;
			}

			if (answers[i] == person3[i%person3.length]) {
				correctCnt[2]++;
			}
		}
		
		//留욏엺 媛쒖닔 理쒕�媛� 援ы븯湲�
		int max = Math.max(correctCnt[0], Math.max(correctCnt[1], correctCnt[2]));
		
		List<Integer> list = new ArrayList<Integer>();
		if(correctCnt[0]==max) {list.add(1);}
		if(correctCnt[1]==max) {list.add(2);}
		if(correctCnt[2]==max) {list.add(3);}

		return list.stream().mapToInt(i->i).toArray();
	}
}
