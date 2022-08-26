package array;

public class DscendingArray {
	public static void main(String[] args) {
		int[] a= {99,98,97,100,81,82,83,89,88,90};
		int hold;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					
				hold=a[i];
				a[i]=a[j];
				a[j]=hold;
				
			}
	      }
		}
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}