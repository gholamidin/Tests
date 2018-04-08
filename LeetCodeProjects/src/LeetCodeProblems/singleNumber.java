package LeetCodeProblems;

public class singleNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,1,2,2,3,4,4};
		int res = singleNumber(nums);
		System.out.println(res);
	}
	 public static int singleNumber(int[] nums) {
	        for(int i =0;i<nums.length;i=i+2){
	        	if (nums[i] == nums[i+1]) {
	        		
				}
	        	
	            else {
					return nums[i];				}
	        	
	        }
			return 0;
			
	        
	        
	    }

}
