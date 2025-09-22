
package basicPackage;
class car{	
	String name;
	int noofSeats;
	int noofcars;

}

public class callbyrefernce {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		car s= new car();
		s.name="chand";
		s.noofcars=4;
		s.noofSeats=6;
		System.out.println(s.name);
		System.out.println(s.noofSeats);
		System.out.println(s.noofcars);
		car b;
		b=s;
		b.name="hari";
		b.noofSeats=7;
		b.noofcars=8;
		System.out.println(b.name);
		System.out.println(b.noofSeats);
		System.out.println(b.noofcars);
		
				
		

	}

}
