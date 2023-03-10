package recursion;

public class PrintForwardByBackTracking {

	public static void main(String[] args) {
		
		printForward(5,5);//1,2,3,4,5,...
	}
	
	public static void printForward(int i,int j) {
		
		if(i<1) return;
		
		printForward(i-1, j);
		System.out.println(i);
	}

}
