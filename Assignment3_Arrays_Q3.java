
public class Assignment3_Arrays_Q3 {

	    public void nextPermutation(int[] nums) {
	    
	        int i = nums.length - 2;
	        while (i >= 0 && nums[i] >= nums[i + 1]) {
	            i--;
	        }
	        
	        if (i >= 0) {
	            
	            int j = nums.length - 1;
	            while (j > i && nums[j] <= nums[i]) {
	                j--;
	            }
	            
	            
	            swap(nums, i, j);
	        }
	        
	        
	        reverse(nums, i + 1);
	    }
	    
	    private void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	    
	    private void reverse(int[] nums, int start) {
	        int i = start;
	        int j = nums.length - 1;
	        
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        
	        Assignment3_Arrays_Q3 solution = new Assignment3_Arrays_Q3();
	        solution.nextPermutation(nums);
	        
	        System.out.println("Next permutation:");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
	}

