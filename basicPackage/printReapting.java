package basicPackage;
import java.util.Scanner;
public class printReapting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Countnumber(arr);
	}
	public static void Countnumber(int[] arr){
		boolean c = false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.print(arr[i]+" ");
				c=true;
				i++;
			}
		
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					i++;
				}
				else {
					break;
				}
			}	
		}
		if(c==false)
			System.out.print(-1);
		
     }
}	
	
