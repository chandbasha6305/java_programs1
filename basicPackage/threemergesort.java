package basicPackage;

import java.util.Scanner;

public class threemergesort {
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
		System.out.println("enter the three  array size ");
		int l=sc.nextInt();
		int[] arr3=new int[l];
		System.out.println("enter the three  array ");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=sc.nextInt();
		
		}
		int res[]=mereagethreesort(arr,arr2,arr3);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
	}
	public static int[] mereagethreesort(int[] arr,int[] arr2,int[] arr3) {
		int i=0;
	
		int k=0;
		int[] res=new int[arr.length+arr2.length+arr3.length];
		while(i<res.length) {
			if(i<arr.length) {
				res[k]=arr[i];
				k++;
			}
			if(i<arr2.length) {
				res[k]=arr2[i];
				k++;
			}
			if(i<arr3.length) {
				res[k]=arr3[i];
				k++;
			}
			i++;
		}
		return res;
	}
}	

















