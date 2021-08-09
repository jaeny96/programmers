package kakao;

import java.util.Stack;

public class kakao_level1_crane {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		int res = solution(board, moves);
		System.out.println(res);
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		//stack의 peek값과 비교할 값 초기 설정
		int peekInit = -1;
		//stack 선언
		Stack<Integer> bucket = new Stack<Integer>();
		//stack이 empty일 경우 stack.peek() 오류 방지 용 값 push
		bucket.push(0);
		
		//Loop1 - moves 탐색
		Loop1: for (int m = 0; m < moves.length; m++) {
			//Loop2 - board 탐색
			Loop2: for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					//board[i][j]가 0이 아니면서 행값이 moves[m]-1과 같은 값인지 비교
					if (board[i][j] != 0 && board[i][j] == board[i][moves[m] - 1]) {
						//bucket에 push
						bucket.push(board[i][moves[m] - 1]);
						//인형이 board에서 뽑혀 나갔으므로 해당 board값 0 설정
						board[i][moves[m] - 1] = 0;
						//bucket의 가장 상단 값과 peekInit의 값이 다를경우
						if (bucket.peek() != peekInit) {
							//bucket의 가장 상단값을 peekInit에 대입
							peekInit = bucket.peek();
						} else {
							//bucket의 상단값과 peekInit의 값이 같으므로 인형 2개 없애기
							bucket.pop();
							bucket.pop();
							answer += 2;
							//현재의 bucket 상단 값을 비교할 값 peekInit에 대입
							peekInit = bucket.peek();
						}
						//Loop2만 break
						break Loop2;
					}
				}
			}
		}
		
		return answer;
	}
}
