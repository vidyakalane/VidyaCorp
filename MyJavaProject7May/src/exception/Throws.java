package exception;

public class Throws {
	public static void main(String[] args) throws InterruptedException,ArithmeticException{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		Thread.sleep(2000);
	
		System.out.println(5);
	
		try {
			System.out.println(4/0);
		}
		catch(NullPointerException  ref){
		System.out.println("catch block1"+ref.getMessage());
			
		}
	
	catch(ArithmeticException aaa){
	System.out.println("catch block2"+aaa.getMessage());
		
	}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println(6);
	}

}
