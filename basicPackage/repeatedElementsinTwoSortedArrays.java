/*ind and print the elements that are repeated in both given sorted arrays.

Input Format
The input consists of four lines:

An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.

N space-separated integers, denoting the elements of array A

An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B

M space-separated integers, denoting the elements of array B.

Output Format
Print the repeated elements from both arrays in ascending order, separated by a space.

Sample Inputs & Outputs
Sample Input 1

6
2 4 5 5 7 8
7
2 3 5 5 6 7 8
Sample Output 1

2 5 5 7 8
Sample Input 2

5
1 2 3 4 5
5
2 3 4 5 6
Sample Output 2

2 3 4 5
Constraints
The elements in both arrays A and B are integers.

The elements in each array are sorted in ascending order.

All input elements fit within the integer */


package basicPackage;

import java.util.Scanner;

public class repeatedElementsinTwoSortedArrays {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the first array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the second array size");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		System.out.println("enter the first array elements");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		reaping(arr,arr2);
		
		
		
	}
	public static void reaping(int[] arr,int[] arr2) {
		int i=0;
		int j=0;
		while(i<arr.length && j<arr2.length) {
			if(arr[i]==arr2[j]) {
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
			else if(arr2[j]<arr[i]) {
				j++;
			}
			else{
				i++;
			}
			
		}

	}
}	



























