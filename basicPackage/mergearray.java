/*Problem
Given two sorted array of integers, merge these two arrays and print it as the output.

Input Format
First line contains an integer n representing the size of the array The Second line consists of a single line containing space-separated integers. Third line contains an integer n representing the size of the array The Fourth line consists of a single line containing space-separated integers.

Output Format
Print the merged array.

Sample Inputs & Outputs
Sample Input 1

3
1 2 3
4
4 5 6 7
Sample Output 1

Merged array: 1 2 3 4 5 6 7
Sample Input 2

4
1 2 3 4
5
3 4 5 6 7
Sample Output 2

Merged array: 1 2 3 4 3 4 5 6 7
Constraints
1 <= N <= 10^5 -10^5 <= arr[i] <= 10^5 N is always */

package basicPackage;

import java.util.Scanner;

public class mergearray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int[] res=mergeesortele(arr,arr2);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
		
	}
	public static int[] mergeesortele(int[] arr,int[] arr2) {
		int[] res=new int[arr.length+arr2.length];
		int i=0,j=0,k=0;
		//while(i<arr.length && j<arr2.length) {
			if(arr[i]>=arr2[j]) {
				res[k]=arr[j];
				k++;
				j++;
			}
			else if(arr[i]<=arr2[j]) {
				res[k]=arr[i];
				k++;
				i++;
			}
		//}	
		while(i<arr.length) {
			res[k]=arr[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			res[k]=arr2[j];
			k++;
			j++;
		}
		
		return res;
	}

}
