
public class Assignment3_Arrays_Q5 {
	
	    public int[] plusOne(int[] digits) {
	        int n = digits.length;
	        
	        
	        for (int i = n - 1; i >= 0; i--) {
	           
	            digits[i] += 1;
	            
	            
	            if (digits[i] == 10) {
	                digits[i] = 0;
	            } else {
	                
	                return digits;
	            }
	        }
	        
	       
	        int[] result = new int[n + 1];
	        result[0] = 1;
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] digits = {1, 2, 3};
	        
	        Assignment3_Arrays_Q5 solution = new Assignment3_Arrays_Q5();
	        int[] result = solution.plusOne(digits);
	        
	        System.out.println("Result: ");
	        for (int digit : result) {
	            System.out.print(digit + " ");
	        }
	    }
	}

