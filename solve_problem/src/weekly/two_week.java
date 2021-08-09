package weekly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class two_week {

	public static void main(String[] args) {
//		int[][] scores = {{100,90,98,88,65},
//		                  {50,45,99,85,77},
//		                  {47,88,95,80,67},
//		                  {61,57,100,80,65},
//		                  {24,90,94,75,65}};
//		int[][] scores = {{50,90},
//				{50,87}};
		int[][] scores = {{70,49,90},
				{68,50,38},
				{73,31,100}};
		System.out.println(solution(scores));
	}
	
    public static String solution(int[][] scores) {
        String answer = "";
        //자기 자신이 평가한 점수 저장 List
        List<Integer> selfChk = new ArrayList<>();
        for(int i=0; i<scores.length; i++) {
        	selfChk.add(scores[i][i]);
        }
        
        //그 외 사람이 평가한 자기 점수 저장 List
        Map<Integer,List<Integer>> scoreMap = new HashMap<>(); 
        for(int i=0; i<scores.length; i++) {
        	List<Integer> scoreList = new ArrayList<>();
        	for(int j=0; j<scores[i].length; j++) {
        		if(i!=j) {
        			scoreList.add(scores[j][i]);
        		}
        	}
        	scoreMap.put(i, scoreList);
        }
        
        //자신이 평가한 점수가 유일한 최저점? 최고점? 판단 후 제거
        for(int key : scoreMap.keySet()) {
        	chkSelfScoreMinMax(scoreMap.get(key), selfChk.get(key));
        }
        
        for(int key : scoreMap.keySet()) {
        	//각 학생의 평균값 구하기
        	double avg = calAvg(scoreMap.get(key));
        	//각 학생의 평균에 따른 학점값 연결
        	answer+=chkScore(avg);
        }
        return answer;
    }
    
    public static List<Integer> chkSelfScoreMinMax(List<Integer> scoreList, int compare){
    	List<Integer> modiList = new ArrayList<>();
    	int min=compare;
    	int max=compare;
    	
    	//최소,최대값 구하기
    	for(int i=0; i<scoreList.size(); i++) {
    		if(min > scoreList.get(i) ) {
    			min=scoreList.get(i);
    		}
    		
    		if(max < scoreList.get(i)){
    			max=scoreList.get(i);
    		}
    		
    	}
    	
    	//최소,최대값이 selfChk 값이고 유일한 값인지 확인
    	if(min==compare || max==compare) {
    		if(scoreList.contains(compare)) {
    			scoreList.add(compare);
    		}
    	}else {
    		scoreList.add(compare);
    	}
    	
    	return modiList;
    }
    
    public static double calAvg(List<Integer> scoreList) {
    	int sum=0;
    	for(int s : scoreList) {
    		sum+=s;
    	}
    	double avg = (double)sum/scoreList.size();
    	return avg;
    }
    
    public static String chkScore(double avg) {
    	if(avg>=90) {
    		return "A";
    	}else if(avg>=80) {
    		return "B";
    	}else if(avg>=70) {
    		return "C";
    	}else if(avg>=50) {
    		return "D";
    	}else {
    		return "F";
    	}
    }
}
