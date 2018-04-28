package LeetCodeProblems;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;
import com.sun.org.apache.regexp.internal.recompile;

public class ReshapeMatrix {

	public static void main(String[] args) {
		int[][] nums = {{1,2},{3,4}};
		int r = 1;
		int c = 4;
		System.out.println(matrixReshape(nums, r, c));
		

	}
	
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
    	
    	int size = r*c;
    	int rows = nums.length;
    	int columns = nums[0].length;
    	if (size != r*c){
    		return nums;
    	}
    	
    	int res[][] = new int[r][c];
    	int r_idx = 0;
    	int c_idx = 0;
    	    for(int i =0;i<rows;i++){
    	        for(int j =0;j<columns;j++){
    	            res[r_idx][c_idx] = nums[i][j];
    	            c_idx++;
    	            if(c_idx == c){
    	        	   r_idx++;
    	        	   c_idx =0;   
    	           }
    	        	
    	        }
    	     }
    	    return res;
    	
    	}
    }


