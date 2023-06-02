

	import java.util.Arrays;

	public class Assignment3_Arrays_Q1 {
	    public int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        
	        int n = nums.length;
	        int closestSum = nums[0] + nums[1] + nums[2];
	        
	        for (int i = 0; i < n - 2; i++) {
	            int left = i + 1;
	            int right = n - 1;
	            
	            while (left < right) {
	                int sum = nums[i] + nums[left] + nums[right];
	                
	                if (sum == target) {
	                    return target;
	                }
	                
	                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
	                    closestSum = sum;
	                }
	                
	                if (sum < target) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	        }
	        
	        return closestSum;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {-1, 2, 1, -4};
	        int target = 1;
	        
	        Assignment3_Arrays_Q1 solution = new Assignment3_Arrays_Q1();
	        int closestSum = solution.threeSumClosest(nums, target);
	        
	        System.out.println("Closest sum to the target: " + closestSum);
	    }
	}

