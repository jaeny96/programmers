package kakao;

public class kakao_level1_newId {

	public static void main(String[] args) {
		String id = "=.=";

		System.out.println(solution(id));
	}

	public static String solution(String new_id) {
		StringBuffer sb = new StringBuffer();
		
		// 1단계
		new_id=new_id.toLowerCase();

		// 2단계
		new_id=new_id.replaceAll("[^-_.a-z0-9]", "");
		
		// 3단계
		sb.append(new_id);
		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.charAt(i) == '.' && sb.charAt(i) == sb.charAt(i + 1)) {
				sb.deleteCharAt(i+1);
				i--;
			}
		}
		
		// 4단계
		if(sb.length()!=0 && sb.charAt(0)=='.') {
			sb.deleteCharAt(0);
		}

		if(sb.length()!=0 && sb.charAt(sb.length()-1)=='.') {
			sb.deleteCharAt(sb.length()-1);
		}
		
		// 5단계
		if(sb.length()==0) {
			sb.append("a");
		}
		
		// 6단계
		if(sb.length()>=16) {
			sb.delete(15, sb.length());
		}
		
		if(sb.length()!=0 && sb.charAt(sb.length()-1)=='.') {
			sb.deleteCharAt(sb.length()-1);
		}

		// 7단계
		if (sb.length() <= 2) {
			for (int i = sb.length(); i < 3; i++) {
				sb.append(sb.charAt(sb.length() - 1));
			}
		}

		return sb.toString();
	}
}
