

	import java.util.Arrays;

	public class Assignment3_Arrays_Q8 {
	    public boolean canAttendMeetings(int[][] intervals) {
	        
	        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

	        
	        for (int i = 1; i < intervals.length; i++) {
	            if (intervals[i][0] < intervals[i - 1][1]) {
	                return false; 
	            }
	        }

	        return true; 
	    }

	    public static void main(String[] args) {
	        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};

	        Assignment3_Arrays_Q8 scheduler = new Assignment3_Arrays_Q8();
	        boolean canAttendAllMeetings = scheduler.canAttendMeetings(intervals);

	        System.out.println("Can attend all meetings? " + canAttendAllMeetings);
	    }
	}

