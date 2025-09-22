package basicPackage;

public class rectanglepatte {
	public static void main(String[] args) {
		int n=5;
		//chandlette(n);
		rec(n);
	}
	public static void rec(int n) {
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<=n*5;j++) {
				if(j==1||i==n*2||j==n*5||i==1) {
					System.out.print("* ");
				}
				if(j==1||i==n||i==1) {
					System.out.print("* ");
				}
				//else {
				//	System.out.print("  ");
				//}

					
				}
			}
			System.out.println();
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
