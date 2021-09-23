//파일명 정렬
package level2.kakao;

import java.util.Arrays;
import java.util.Comparator;

public class kakao_fileNameSort {

	public static void main(String[] args) {
		String[] files = { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" };
		for (String s : solution(files)) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[] files) {
		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String head1 = o1.split("[0-9]")[0].toLowerCase();
				String head2 = o2.split("[0-9]")[0].toLowerCase();

				int result = (head1).compareTo(head2);

				if (result == 0) {
					String numberTail1 = o1.substring(head1.length());
					String numberTail2 = o2.substring(head1.length());

					return number(numberTail1) - (number(numberTail2));
				} else {
					return result;
				}
			}
		});
		return files;
	}

	public static int number(String s) {
		String tmp = "";
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) && tmp.length() <= 5) {
				tmp += c;
			} else {
				return Integer.parseInt(tmp);
			}
		}

		return Integer.parseInt(tmp);
	}
}
