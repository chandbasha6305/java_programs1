package basicPackage;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=5;
		//incrementtirange(n);
		//decrementtri(n);
		//square(n);
		//permade(n);
		//squarehelo(n);
		//cletter(n);
		//hletter(n);
		//Aletter(n);
		//nletter(n);
		//dletter(n);
		chandlette(6);
		
		
	}
	public static void incrementtirange(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void decrementtri(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void square(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void permade(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
					if(j==1||i==n||i==j) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
			System.out.println();
			}
		
	}
	public static void squarehelo(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==n||i==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void cletter(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==n||i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void hletter(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void Aletter(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
					if(j==1||i==j||i==3) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
			System.out.println();
			}
		
		
		
	}
	public static void nletter(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void chandlette(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==n||i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<=1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==n/2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<=1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				
				if(j==1||i==1||j==n||i==n/2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			for(int j=1;j<=1;j++) {
				System.out.print("  ");
			}

			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<=1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				if(j==1||i==n||i==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
}
