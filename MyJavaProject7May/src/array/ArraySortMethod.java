package array;
import java.util.Arrays;
public class ArraySortMethod {
	public static void main(String[] args) {
		int [] a= {5,9,8,7,5,6,99,88,55,66,44,33,33,22,11,77};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
	}

}
