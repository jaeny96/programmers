//기능개발
package level2.stackQueue;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class stackQueue_functionDevelopment {

	public static void main(String[] args) {
		int[] progressses= {93, 30, 55};
		int[] speeds= {1, 30, 5};
		for(int i : solution(progressses,speeds)) {
			System.out.println(i);
		}
	}
    public static List<Integer> solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for(int i=0; i<progresses.length; i++) {
        	while(progresses[i]+(speeds[i]*count)<100) {
        		count++;
        	}
        	map.put(count, map.getOrDefault(count, 0)+1);
        }
     
        
        return new ArrayList<>(map.values());
    }
}
