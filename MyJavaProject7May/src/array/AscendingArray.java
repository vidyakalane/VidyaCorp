package array;

public class AscendingArray {
public static void main(String[] args) {
	int hold;
	int[] a= {99,98,97,100,81,82,83,89,88,90};
	for(int i=0;i<a.length;i++)
		for(int j=i;j<a.length;j++) {
			if(a[i]>a[j]) {
				hold=a[i];
				a[i]=a[j];
				a[j]=hold;
				
			}
		}
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
}
}
