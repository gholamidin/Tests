package control;

import com.sun.media.sound.SoftJitterCorrector;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//静态初始化
		//int score[]={0,1,2,4,5,6,7,8,9}
		
		int score[]=null;//数组声明
		score=new int[100];//为数组开辟内存空间
		
		for(int i=0;i<score.length;i++){
			score[i]=i*2+1;
		}
		for(int i=0;i<score.length;i++){
				System.out.println(score[i]);
	}

}
}