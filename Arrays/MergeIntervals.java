package arraysLB;

import java.util.*;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
	       Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
	        List<int[]> list = new ArrayList<>();
	        int start = intervals[0][0];
	        int end = intervals[0][1];
	        for(int[] i : intervals){
	            if(end<i[0]){
	                list.add(new int[]{start, end});
	                start = i[0];
	                end = i[1];
	            }else{
	                end = Math.max(end, i[1]);    
	            }
	        }
	        
	        list.add(new int[]{start, end});
	        return list.toArray(new int[list.size()][2]);
	    
	    }
}
