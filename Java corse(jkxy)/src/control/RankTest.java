package control;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class RankTest {
//冒泡排序 小到大
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]={12,44,8,26,55,97,66};
		for(int i=0;i<=score.length-1;i++){
			for(int j=i+1;j<score.length;j++){
				if (score[i]>score[j]) {
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			//System.out.println("第"+i+"次排序");
			} 
		for(int i=0;i<score.length;i++){
			System.out.println(score[i]);			
		}
		showArray(score);
		
	}

private static void showArray(int[] score) {
	// TODO Auto-generated method stub
		for(int i:score){
			System.out.println("<"+i);
		}
		System.out.println();
}

}
