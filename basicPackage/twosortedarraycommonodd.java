package basicPackage;


import java.util.Scanner;
/*Problem
Find the common repeating odd elements in two sorted arrays.

Input Format
First line contains an integer representing size of the array A

Second line contains an Integers separated by a space, representing the elements of array A (A[0], A[1], ..., A[n-1]).

Third line contains an integer representing size of the array B

Fourth line contains an Integers separated by a space, representing the elements of array B (B[0], B[1], ..., B[m-1]).

Output Format
Print a single line containing the odd elements that are common to both arrays, separated by a space, in ascending order.

If no common odd elements are found, output "No common odd elements found."

Sample Inputs & Outputs
Sample Input 1

5
1 2 3 4 5
5
3 4 5 6 7
Sample Output 1

3 5
Sample Input 2

4
2 4 6 8
4
1 3 5 7
Sample Output 2

No common odd elements found.
*/
public class twosortedarraycommonodd {
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
		oddele(arr,arr2);
		
	}
	public static void oddele(int[]arr,int[] arr2) {
		int i=0,j=0;
		boolean f=false;
		while(i<arr.length && j<arr2.length) {
			if(arr[i]==arr2[j]) {
				if(arr[i]%2!=0) {
					f=true;
					System.out.println(arr[i]+" ");
				}
				i++;
				j++;
			}
			else if(arr2[j]>arr[i]) {
				i++;
			}
			else if(arr2[j]<arr[i]) {
				j++;
			}
			
			
		}
		if(f==false) {
			
			System.out.println("no odd repaeting elements");
			
		}
		
	}

}
