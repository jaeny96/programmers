//평균구하기
package level1.practice;

public class practice_average {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));

	}
    public static double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
        	answer+=i;
        }
        return answer/arr.length;
    }
}
