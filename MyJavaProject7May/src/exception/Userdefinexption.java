package exception;

public class Userdefinexption {
	public void m1(String name,int age) {
		System.out.println(name+""+age);
		try {
			if(age<=18)
				throw new IllegalArgumentException("underAge");
			else
				System.out.println("allowed it");
		}
		catch(IllegalArgumentException a) {
			System.out.println(a.getMessage());
			
		}
	}
public static void main(String[] args) {
	Userdefinexption checkage =new Userdefinexption();
	checkage.m1("Vidya", 29);
	checkage.m1("Krisha", 3);
}
}
