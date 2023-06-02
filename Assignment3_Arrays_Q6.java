
public class Assignment3_Arrays_Q6 {
	
	    public int singleNumber(int[] nums) {
	        int result = 0;
	        
	       
	        for (int num : nums) {
	            result ^= num;
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {2, 2, 1};
	        
	        Assignment3_Arrays_Q6 solution = new Assignment3_Arrays_Q6();
	        int single = solution.singleNumber(nums);
	        
	        System.out.println("Single number: " + single);
	    }
	}

