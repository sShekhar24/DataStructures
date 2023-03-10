package recursion;

public class PrintBackwardTill1 {

	public static void main(String[] args) {
		
		printBackwards(5,1);

	}
	public static void printBackwards(int i,int j) {
		
		if(i < j) return;
		
		System.out.println(i);
		printBackwards(i-1,j);
		
	}

}
