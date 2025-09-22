package basicPackage;

import java.util.Scanner;

public class findindex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		sorIndex(arr);

		
	}
	public static void sorIndex(int[] arr) {
		boolean t=false;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				t=true;
				
				System.out.print(arr[i+1]);
			}
	
		}
		if(t==false) {
			System.out.print(-1);
		}
	}

}
