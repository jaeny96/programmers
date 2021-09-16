//124나라의 숫자
package level2.practice;

public class practice_124countryNumber {

	public static void main(String[] args) {
		int n =3;
		System.out.println(solution(n));
	}
	public static String solution(int n) {
		String answer ="";
		String[] tmp = {"4","1","2"};
		
		while(n>0) {
			answer+=tmp[n%3];			
			if(n%3==0) {
				n=n-1;
			}
			n=n/3;
		}
		StringBuffer sb = new StringBuffer(answer);
		return sb.reverse().toString();
	}

}
