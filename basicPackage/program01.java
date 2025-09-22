package basicPackage;
import java.util.Scanner;

public class program01 {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the  size number");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int maxSum=sumArray(arr)-maxarray(arr);
		int minSum=sumArray(arr)-minarray(arr);
		System.out.println("minmium sum:"+maxSum);
		System.out.println("maxmium sum:"+minSum);
		
		
	}
	public static int sumArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
		
	}
	public static int maxarray(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max ;			
	}
	public static int minarray(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			
			}
			
		}
		return min ;
		
	}
}