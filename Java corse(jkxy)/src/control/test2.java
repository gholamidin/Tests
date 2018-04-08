package control;

public class test2 {
	public static void main(String[] args) {
    //System.out.println("((sqrt(20)+sqrt(10))/((sqrt(20)-sqrt(10))="+(Math.sqrt(20)+Math.sqrt(10)) 
	//			/(Math.sqrt(20)-Math.sqrt(10)));
		@SuppressWarnings("unused")
		double sqrt20=Math.sqrt(20);
		double sqrt10=Math.sqrt(10);
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		result =Math.round(result*10)/10.0;
		System.out.println("((sqrt(20)+sqrt(10))/((sqrt(20)-sqrt(10))="+result);
	}
	
}

