package basicPackage;

import java.util.Scanner;

public class countonenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		sorIndex(arr,k);
	}
	public static void sorIndex(int[] arr,int k) {
		boolean f=false;
		int count=1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1] && arr[i]==k) {
				f=true;
				count++;
			}
	
		}
	
		if(f==true) {
			System.out.print(count);	
		}
		else {
			System.out.print(count);
		}
	}
	
}	