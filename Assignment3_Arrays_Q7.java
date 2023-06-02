

	import java.util.ArrayList;
	import java.util.List;

	public class Assignment3_Arrays_Q7 {
	    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
	        List<String> result = new ArrayList<>();

	      
	        long start = (long) lower;
	        long end = (long) nums[0] - 1;
	        addRange(result, start, end);

	      
	        for (int i = 1; i < nums.length; i++) {
	            start = (long) nums[i - 1] + 1;
	            end = (long) nums[i] - 1;
	            addRange(result, start, end);
	        }

	       
	        start = (long) nums[nums.length - 1] + 1;
	        end = (long) upper;
	        addRange(result, start, end);

	        return result;
	    }

	    private void addRange(List<String> result, long start, long end) {
	        if (start > end) {
	            return;
	        } else if (start == end) {
	            result.add(String.valueOf(start));
	        } else {
	            result.add(start + "->" + end);
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {0, 1, 3, 50, 75};
	        int lower = 0;
	        int upper = 99;

	        Assignment3_Arrays_Q7 solution = new Assignment3_Arrays_Q7();
	        List<String> missingRanges = solution.findMissingRanges(nums, lower, upper);

	        System.out.println("Missing Ranges:");
	        for (String range : missingRanges) {
	            System.out.println(range);
	        }
	    }
	}

