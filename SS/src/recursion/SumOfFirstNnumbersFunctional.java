package recursion;

public class SumOfFirstNnumbersFunctional {

	public static void main(String[] args) {
		int n = 3;

		int s = Sum(n,0);
		System.out.println(s);
	}

	public static int Sum(int i, int sum) {


		if(i==0) return sum;

		return Sum(i-1,sum+i);
	}

}
