package basicPackage;
import java.util.*;

public class parrtern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the number :");
		int n=scan.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println(" ");
			
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		} 
	}

}
