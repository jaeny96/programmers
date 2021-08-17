package codingTest.mailplug;

public class problem3 {

	public static void main(String[] args) {
		int n = 5;
		int r = 3;
		int c = 2;
		System.out.println(solution(n, r, c));
	}

	public static long solution(int n, int r, int c) {
		long[][] arr = new long[n][n];
		int cnt = 1;
		int currX = 0;
		int currY = 0;
		arr[currX][currY] = cnt++;

		while(cnt<(n*n)) {
			if(currX+1<n) {
				currX++;
			}else {
				currY++;
			}
			
			//좌측하향
			while(currY-1>-1 && currX+1<n){
				arr[++currX][--currY]=cnt++;
			}
			
//			if(currY+1<n) {
//				currY++;
//			}
			
			//우측상향
			while(currX-1> -1 && currY+1<n) {
				arr[--currX][++currY]=cnt++;
			}
		}
		for (long[] iArr : arr) {
			for (long i : iArr) {
				System.out.print(i + "  ");
			}
			System.out.println();
		}

//		int tmp=0;
//		for (int i = 0; i < arr.length; i++) {
//			tmp = 0;
//			for (int j = 0; j < i + 1; j++) {
//				if (i % 2 != 0) {
//					arr[tmp][i - tmp] = cnt++;
//				} else {
//					arr[i - tmp][tmp] = cnt++;
//				}
//				tmp++;
//			}
//		}
//
//		for (int i = 1; i < n; i++) {
//			tmp = 0;
//			for (int j = i; j < n; j++) {
//				if ((i + n - 1) % 2 != 0) {
//					arr[i + tmp][n - 1 - tmp] = cnt++;
//				} else {
//					arr[n - 1 - tmp][i + tmp] = cnt++;
//				}
//				tmp++;
//			}
//		}

		return arr[r - 1][c - 1];
	}

}
