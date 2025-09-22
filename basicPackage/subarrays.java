package basicPackage;

import java.util.Scanner;

public class subarrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("eneter the arraay elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the sub array size");
		int k=sc.nextInt();
		System.out.println("enter the sum of equal of number");
		int r=sc.nextInt();
		allsubarry(arr);
		
	}
	public static void subarrays(int[] arr,int k) {
		for(int i=0;i<=arr.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
	public static void sumofsubarray(int[] arr,int k) {
		int sum=0;
		for(int i=0;i<=arr.length-k;i++) {
			sum=0;
			for(int j=i;j<i+k;j++) {
				sum=sum+arr[j];
			}
		}
		System.out.println();
	}
	public static void sumofcountsubarray(int[] arr,int k,int r) {
		int sum=0;
		int count=0;
		for(int i=0;i<=arr.length-k;i++) {
			sum=0;
			for(int j=i;j<i+k;j++) {
				sum=sum+arr[j];
			}
			if(sum==r) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	public static void sumisequalthenprintsubarray(int[] arr,int k,int r) {
		int sum=0;
		for(int i=0;i<=arr.length-k;i++) {
			sum=0;
			for(int j=i;j<i+k;j++) {
				sum=sum+arr[j];
			}
			if(sum==r) {
				for(int j=i;j<i+k;j++){
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
			
		}
		System.out.println();
	}
	
	public static void allsubarry(int[] arr) {
		for(int k=0;k<=arr.length;k++) {
			for(int i=0;i<=arr.length-k;i++) {
				for(int j=i;j<i+k;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
			//System.out.println();
		}
		//System.out.println();	
	}

}
