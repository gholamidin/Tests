package LeetCodeProblems;

public class TeoplitzMatrix {
     public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		boolean res = isToeplitzMatrix(matrix);
		System.out.println(res);
	}
     
     public static boolean isToeplitzMatrix(int[][] matrix) {
         for(int i =matrix.length-1;i>0;i--){
             for(int j =matrix[0].length-1;j>0;j--){
                 if(matrix[i][j]!=matrix[i-1][j-1]){
                	 return false;
                 }
             }
         }
         return true;
     }
}

