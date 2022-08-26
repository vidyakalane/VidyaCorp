package array;
import java.util.Arrays;

public class ComapareArray {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int[]b= {4,5,6};
		int[]c= {1,2,3,4,5,6};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(a,c));
	}

}
