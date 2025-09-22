package basicPackage;

import java.util.Scanner;

public class repeatedElementsigdhrtt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the first array elee");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the sec array size");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		System.out.println("enter the sce  array ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		repating(arr,arr2);

	}
	public static void repating(int[] arr,int[] arr2) {
		int i=arr.length-1;
		int j=0;
		while(i>=0 &&j<arr2.length) {
			if(arr[i]==arr2[j]) {
				System.out.print(arr[i]+" ");
				i--;
				j++;
			}
			else if(arr[i]>arr2[j]) {
				j++;
			}
			else if(arr[i]<arr2[j]) {
				i--;
			}
		}
	}
}	













