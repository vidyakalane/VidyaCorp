package exception;



public class AssertionError {

	public static void main(String [] args) {
		int marks=39;
		assert marks>=40:"Failed";
		System.out.println("mark is "+ marks+" passed");
	}

}
