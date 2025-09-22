package basicPackage;
//how to work method
class Calaculator{
	int c;
	void add() {
		int a=10;
		int b=20;
		c=a+b;
		System.out.print(c);
	}
}

public class corejavamethod {
	public static void main(String[] args) {
		Calaculator cal=new Calaculator();
		cal.add();
	}

}
