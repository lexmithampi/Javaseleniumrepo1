package inheritance;

public class ChildClass extends ParentClass // inheritance

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		c.parent1();
		c.child1(5, 10);
		
	}
	
	public void child1(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}

}
