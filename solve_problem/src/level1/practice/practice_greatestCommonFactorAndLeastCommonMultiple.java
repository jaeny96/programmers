//최대공약수와 최소공배수
package level1.practice;

public class practice_greatestCommonFactorAndLeastCommonMultiple {

	public static void main(String[] args) {
		int n=2;
		int m=5;
		for(int i : solution(n,m)) {
			System.out.println(i);
		}
	}
    public static int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        int lcm = (n/gcd)*(m/gcd)*gcd;
        int[] answer = {gcd,lcm};
        return answer;
    }
    
    public static int gcd(int A, int B) {
    	if(A%B==0) {
    		return B;
    	}else {
    		return gcd(B,A%B);
    	}
    }
}
