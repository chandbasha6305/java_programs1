package basicPackage;

import java.util.Scanner;

public class countuniqueelement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		counttt(arr);

	}
	public static void counttt(int[] arr) {
		int count=1;
		int unique=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] ==arr[i+1]) {
				count=count+1;
			}
			else {
				if(count==1) {
					unique++;
				}
				count=1;
			}
			
		}
		if(count==1) {
			unique++;
		}
		System.out.println(unique);
	}
}