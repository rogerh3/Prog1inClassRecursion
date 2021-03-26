
public class RecursionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling cups method
	//	System.out.println("Cups of water: 10"); 
	//	cups(10); 

		//fibonacci
		for (int i=0; i<10; i++) {
			System.out.println(fibRec(i) + " ");
			}

	}
	
	public static int cups(int c) {
		//base case
		if(c ==0) {
			return 0;
		}else {
			System.out.println("Cups of water: " + (c-1) + " ");
			return cups(c-1); 
		}
		
	}
	public static int fibRec(int num){
		//base case
		if (num == 0) {
			return 0;
		}else if (num == 1) {
			return 1;
		}else {
			return fibRec(num-1) + fibRec(num-2); 
		}
	}

}
