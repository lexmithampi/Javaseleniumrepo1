package superkeyword;

public class Childcls extends Parentcls {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childcls c = new Childcls();
		c.parent1(5, 10);

	}
	
	public void parent1(int a, int b) // same method name as that of parent class ; method overriding
	{
		super.parent1(10, 20); // execute the method from parent class
		int sum = a+b;
		System.out.println(sum);
			
	}

}
