package control;

import com.sun.media.sound.SoftJitterCorrector;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��̬��ʼ��
		//int score[]={0,1,2,4,5,6,7,8,9}
		
		int score[]=null;//��������
		score=new int[100];//Ϊ���鿪���ڴ�ռ�
		
		for(int i=0;i<score.length;i++){
			score[i]=i*2+1;
		}
		for(int i=0;i<score.length;i++){
				System.out.println(score[i]);
	}

}
}