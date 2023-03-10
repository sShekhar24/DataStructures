package recursion;

public class PrintNumbersLinearly {

	public static void main(String[] args) {

		printLinearly(1,5); //1,2,3,4,5,...

	}

	public static void printLinearly(int i,int j) {

		if(i>j) return;

		System.out.println(i);
		printLinearly(i+1, j);

	}

}
