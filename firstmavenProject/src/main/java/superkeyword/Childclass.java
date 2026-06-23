package superkeyword;

public class Childclass extends Parentclass{
	
	public Childclass(int a, int b)
	{
		super(10,20);
		int sum = a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass c = new Childclass(5,10);
		

	}

}
