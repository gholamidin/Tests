package LeetCodeProblems;

public final class JumpGame {

    public static boolean canJump(int[] nums) {
        int s_idx = 0;
        int len = nums.length;
        for(int i = 1;i<=nums[s_idx];i++){
            s_idx++;
            len--;
            if(nums[s_idx]>=len){
                return true;
            }
              
        }
            return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		boolean res = canJump(nums);
	}

}
