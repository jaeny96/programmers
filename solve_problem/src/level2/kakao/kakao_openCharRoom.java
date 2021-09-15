//오픈채팅방
package level2.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kakao_openCharRoom {

	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		for (String str : solution(record)) {
			System.out.println(str);
		}

	}

	public static List<String> solution(String[] record) {
		Map<String, String> recordMap = new HashMap<>();
		List<String> result = new ArrayList<>();
		for (String str : record) {
			if (str.split(" ").length == 3) {
				String id = str.split(" ")[1];
				String nickName = str.split(" ")[2];

				recordMap.put(id, nickName);
			}
		}

		for (String str : record) {
			String activity = str.split(" ")[0];
			String id = str.split(" ")[1];

			if(activity.equals("Enter")) {
				result.add(recordMap.get(id)+"님이 들어왔습니다.");
			}else if(activity.equals("Leave")) {
				result.add(recordMap.get(id)+"님이 나갔습니다.");
			}
		}
		
		return result;
	}
}
