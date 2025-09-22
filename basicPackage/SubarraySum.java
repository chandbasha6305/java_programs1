package basicPackage;

import java.util.Scanner;

public class SubarraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int size=sc.nextInt();
		
		subarrays(arr);
	}
	public static void subarrays(int[] arr) {
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<=arr.length-i;j++) {
				for(int k=j;k<i+j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			
		}
	}

}
