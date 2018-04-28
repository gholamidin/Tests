package LeetCodeProblems;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits ={4,3,2,1};
		System.out.println(plusOne(digits));
	

	}
	  public static int[] plusOne(int[] digits) {
		  int idx = digits.length-1;
		  while(idx>=0){
			  int temp = digits[idx];
			     if(digits[idx] != 9){
			    	 digits[idx] = temp + 1;
			    	break;
			    	 
			     }else digits[idx] = 0 ;
			           if(idx == 0){
			        	   int[] nums = new int[digits.length+1];
			        	   nums[0] = 1;
			        	return nums;
			           }
			     idx--;  
		  }
		return digits;
	        
	    }

}
