package org.arr;

public class Array1 {
	public static void main (String []args) {
		int a[]= new int[]{1,2,3,4,5,66,7,8,99,10};
		int sum=0;
		float avg=0.0f;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of array:"+sum);
		avg=sum/a.length;
		System.out.println("The average :"+avg);
	}

}
