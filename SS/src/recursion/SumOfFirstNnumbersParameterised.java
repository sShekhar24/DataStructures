package recursion;

public class SumOfFirstNnumbersParameterised {

	public static void main(String[] args) {

		Sum(3,0);
	}

	public static void Sum(int i,int sum) {

		if(i<1) {
			System.out.println(sum);
			return;
		}

		Sum(i-1,sum+i); //
	}
}
