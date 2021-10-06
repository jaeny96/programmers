//뉴스 클러스터링
package level2.kakao;

import java.util.ArrayList;
import java.util.List;

public class kakao_newsClusturing {

	public static void main(String[] args) {
		String str1 = "FRANCE";
		String str2 = "french";
		System.out.println(solution(str1, str2));
	}

	public static int solution(String str1, String str2) {
		List<String> list1 = makeSet(str1.toLowerCase());
		List<String> list2 = makeSet(str2.toLowerCase());
		List<String> union = new ArrayList<>();
		List<String> intersection = new ArrayList<>();

		if (list1.size() == 0 && list2.size() == 0) {
			return 65536;
		}

		for (String str : list1) {
			if (list2.remove(str)) {
				intersection.add(str);
			}
			union.add(str);
		}

		for (String str : list2) {
			union.add(str);
		}
		
		double u = union.size();
		double i = intersection.size();

		return (int) (i / u * 65536);
	}

	static List<String> makeSet(String str) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < str.length() - 1; i++) {
			if (Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(i + 1)))
				result.add(Character.toString(str.charAt(i)) + str.charAt(i + 1));
		}
		return result;
	}

}
