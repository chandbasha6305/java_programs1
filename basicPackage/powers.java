package basicPackage;
import java.util.Scanner;

public class powers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the power");
		int a=scan.nextInt();
		System.out.print("enter the number");
		int b=scan.nextInt();
		int res=Count1(a,b);
		System.out.print(res);
	}
	public static int Count1(int n,int b) {
		int count=1;
		for(int i=1;i<=n;i++) {
			count=count*b;	
		}
		return count;
	}
	
	
	
	
	
	
	
}
