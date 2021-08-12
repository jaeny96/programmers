//내적
package level1.monthChallenge;

public class monthChanllenge_dot_product {

	public static void main(String[] args) {
		int[] a = { -1,0,1 };
		int[] b = { 1,0,-1 };
		int res = solution(a,b);
		System.out.println(res);
	}

	public static int solution(int[] a, int[] b) {
		int answer = 0;
		int[] dot=new int[a.length];
		for(int i=0; i<a.length; i++) {
			dot[i]=a[i]*b[i];
		}
		for(int i : dot) {
			answer+=i;
		}
		return answer;
	}

}
