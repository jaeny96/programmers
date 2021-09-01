//[1차]다트 게임
package level1.kakao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class kakao_dartGame {

	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		char[] cArr = dartResult.toCharArray();
		Map<String, Integer> map = new LinkedHashMap<>();

		List<Integer> numIdxList = new ArrayList<>();
		List<Integer> idxList = new ArrayList<>();
		List<Integer> calIdxList = new ArrayList<>();
		List<Integer> numList = new ArrayList<>();

		// 각 숫자 저장
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == '1' && cArr[i + 1] == '0') {
				map.put(cArr[i + 2] + "" + (i+2), Integer.parseInt((cArr[i] + "") + (cArr[i + 1] + "")));
				i += 1;
			} else {
				if (48 <= cArr[i] && cArr[i] <= 57) {
					map.put(cArr[i + 1] + "" + (i+1), Integer.parseInt(cArr[i] + ""));
				}
			}
		}

		// SDT 구분하여 계산된 숫자 저장
		for (String str : map.keySet()) {
			if (str.contains("T")) {
				map.put(str, (int) Math.pow(map.get(str), 3));
			} else if (str.contains("D")) {
				map.put(str, (int) Math.pow(map.get(str), 2));
			}
			numIdxList.add(Integer.parseInt(str.substring(1)));
		}
		
		// 계산된 숫자 numList 에 add
		for (String str : map.keySet()) {
			numList.add(map.get(str));
		}

		// 옵션 * 일때
		// *일때 index 모두 찾아 idxList에 add
		if (dartResult.contains("*")) {
			int idx = dartResult.indexOf("*");
			while (idx != -1) {
				idxList.add(idx);
				idx = dartResult.indexOf("*", idx + 1);
			}
		}
		
		for(int i : idxList) {
			System.out.println("idx "+i);
		}

		// SDT index 정보 담겨 있는 calIdxList와 비교하여 calIdxList에 add
		for (int i = 0; i < idxList.size(); i++) {
			for (int j = 0; j < numIdxList.size(); j++) {
				if (idxList.get(i) - 1 == numIdxList.get(j)) {
					calIdxList.add(j);
				}
			}
		}
		
		// calIdxList 정보를 가지고 numList값 변경
		for (int i : calIdxList) {
			if (i > 0) {
				numList.set(i - 1, numList.get(i - 1) * 2);
				numList.set(i, numList.get(i) * 2);
			} else {
				numList.set(i, numList.get(i) * 2);
			}
		}

		// 옵션 # 일때
		idxList.clear();
		calIdxList.clear();

		// #일때 index 모두 찾아 idxList에 add
		if (dartResult.contains("#")) {
			int idx = dartResult.indexOf("#");
			while (idx != -1) {
				idxList.add(idx);
				idx = dartResult.indexOf("#", idx + 1);
			}
		}

		// SDT index 정보 담겨 있는 calIdxList와 비교하여 calIdxList에 add
		for (int i = 0; i < idxList.size(); i++) {
			for (int j = 0; j < numIdxList.size(); j++) {
				if (idxList.get(i) - 1 == numIdxList.get(j)) {
					calIdxList.add(j);
				}
			}
		}

		// calIdxList 정보를 가지고 numList값 변경
		for (int i : calIdxList) {
			numList.set(i, numList.get(i) * (-1));
		}

		for (int i : numList) {
			answer += i;
			System.out.println("num " + i);
		}
		return answer;
	}
}
