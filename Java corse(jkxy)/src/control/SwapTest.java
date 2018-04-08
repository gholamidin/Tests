package control;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.I2B;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={100,20,30,40,50,60,70,80};
//		Arrays.sort(arr);
//		Arrays.fill(arr,0,4,0);
	int index=Arrays.binarySearch(arr,60);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(index);
		}
	}

}
