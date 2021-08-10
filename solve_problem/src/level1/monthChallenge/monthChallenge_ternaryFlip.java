//3진법 뒤집기
package level1.monthChallenge;

public class monthChallenge_ternaryFlip {

	public static void main(String[] args) {
		int n=1;
		System.out.println("answer = "+solution(n));
	}
	
    public static int solution(int n) {
        return makeDecimal(makeTernary(n));
    }
    
    public static String makeTernary(int number) {
    	String result="";
    	String temp="";
    	//숫자가 3보다 작으면 그대로 
    	if(number<3) {
    		result=number+"";
    	}else{ //큰 경우 3진법으로 변경
    		while(number/3>2) {
    			temp+=number%3;
    			number=number/3;
    		}
    		for(int i=temp.toCharArray().length-1; i>-1; i--) {
    			result+=temp.toCharArray()[i];
    		}
    		result = (number/3+"")+number%3+result;    		
    	}
    	return result;
    }
    
    //str : 위치를 바꾸지 않은 String 값, 
    //charArr 처리 시 Flip 했을 때 인덱스 값과 같음 
    public static int makeDecimal(String str) {
    	int result=0;
    	char[] cArr = str.toCharArray();
    	for(int i=0; i<cArr.length; i++) {
    		result+=Integer.parseInt(cArr[i]+"") * Math.pow(3, i);
    	}
    	return result;
    }
}
