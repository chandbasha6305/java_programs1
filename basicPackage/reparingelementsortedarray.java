package basicPackage;

import java.util.Scanner;

public class reparingelementsortedarray {
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
		repeating(arr,arr2);
	}
	public static void repeating(int[]arr,int[] arr2) {
		/*int i=0;
		int j=arr2.length-1;
		while(i<j) {
			int temp=arr2[i];
			arr2[i]=arr2[j];
			arr2[j]=temp;
			i++;
			j--;
		}*/
		int k=0;
		int l=arr2.length-1;
		while(k<arr.length &&l>=0) {
			if(arr[k]==arr2[l]) {
				System.out.print(arr[k]+" ");
				k++;
				l--;
			}
			else if(arr[k]<arr2[l]) {
				k++;
			}
			else if(arr[k]>arr2[l]) {
				l--;
			}
		}
		
	}

}














