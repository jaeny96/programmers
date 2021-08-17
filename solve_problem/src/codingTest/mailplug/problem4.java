package codingTest.mailplug;

public class problem4 {

	public static void main(String[] args) {
		int[] p = { 3,2,1,4,5 };
		System.out.println(solution(p));
	}

	public static int solution(int[] p) {
		int answer = 0;
		for (int i = 0; i < p.length - 1; i++) {
			int min_idx = i;
			if (p[i] > p[i + 1]) {
				swap(p, i, i + 1);
				i += 2;
			}

			if (i > 1 && p[i - 1] > p[i]) {
				swap(p, i - 1, i);
				i += 1;
			}
			for (int j = i; j < p.length; j++) {
				if (p[j] < p[min_idx]) {
					min_idx = j;
				}
			}
			
			if (i != p.length-1) {
				swap(p, min_idx, i);
			}
		}

		for (int i = 0; i < p.length - 1; i++) {
			if (p[i] < p[i + 1]) {
				answer++;
			}
		}

		for (int i : p) {
			System.out.print(i + " ");
		}
		return answer;
	}

	public static void swap(int[] p, int i, int j) {
		int tmp = p[i];
		p[i] = p[j];
		p[j] = tmp;
	}
}
