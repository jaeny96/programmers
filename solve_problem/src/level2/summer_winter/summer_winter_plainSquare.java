package level2.summer_winter;

public class summer_winter_plainSquare {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println(solution(w,h));
	}

	public static long solution(int w, int h) {
		long width = (long)w;
		long height = (long)h;
        return width*height-(width+height-gcd(width,height));
    }
	
	static long gcd(long a, long b) {
		long big=a>b?a:b;
		long small=a>b?b:a;
		
		while(small>0) {
			long temp = big;
			big = small;
			small = temp%small;
		}
		
		return big;
	}
}
