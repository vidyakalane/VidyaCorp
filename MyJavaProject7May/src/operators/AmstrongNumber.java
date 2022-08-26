package operators;

public class AmstrongNumber {
	public static void main(String[] args) {
		int no=12,temp,digit,sum=0;
		//System.out.println("Enter Number: ");
		temp=no;
		while(temp!=0) {
			digit=temp%10;
			temp=temp/10;
			sum=sum+digit*digit*digit;
		}
		if(sum==no)
			System.out.println("Amstrong number");
		else
			System.out.println(" This number is not Amstrong number");
	}

}
