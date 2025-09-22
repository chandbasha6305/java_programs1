package basicPackage;
import java.util.*;

public class unsortedduplic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//for(int i=0;i<arr.length;i++) {
		//	System.out.print(arr[i]+ " ");
		//}
		Arrays.sort(arr);
		duplc(arr);
	}
	/*public static void unsortedDuplica(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}*/
	public static void duplc(int [] arr) {
		int count=1;
		boolean f=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				f=true;
				count++;
			}
			else {
				if(count>=2) {
					System.out.print(arr[i]+" ");
				}
				count=1;
			}
		}
		if(count>=2) {
			System.out.print(arr[arr.length-1]);
		}
		if(f==false) {
			System.out.println(-1);
		}
	}
	
}
