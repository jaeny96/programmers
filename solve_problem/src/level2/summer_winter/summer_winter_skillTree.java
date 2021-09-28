package level2.summer_winter;

public class summer_winter_skillTree {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println(solution(skill, skill_trees));
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		String[] newSt = new String[skill_trees.length];
		char[] cArr = skill.toCharArray();
		for (int i = 0; i < skill_trees.length; i++) {
			newSt[i] = skill_trees[i].replaceAll("[^" + skill + "]", "");
		}

		for(String nst : newSt) {
			System.out.println(nst);
		}
		
		for (String nst : newSt) {
			int tmp = 0, sIdx = 0;
			for (int i = 0; i < nst.length(); i++) {
				if (sIdx == cArr.length)
					break;
				if (nst.charAt(i) == cArr[sIdx]) {
					tmp++;
				}
				sIdx++;
			}
			if (tmp == nst.length() || tmp == cArr.length) {
				answer++;
			}
		}
		return answer;
	}
}
