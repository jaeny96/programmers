//2016년
package level1.practice;

public class practice_2016 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a,b));
		
	}
	
    public static String solution(int a, int b) {
        String[] dayOfWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] maxDays = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum =0;

        if(a>1) {
        	for(int i=0; i<a-1; i++) {
        		sum += maxDays[i];
        	}  
        	sum = sum+b;
        }else {
        	sum=b;
        }
        int index = sum%7;
        if(index==0) {
        	index=7;
        }
        String answer = dayOfWeek[index-1];
        return answer;
    }

}
