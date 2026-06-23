package superkeyword;

public class Child extends Parent {
	
	int a = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.child1();			
		

	}
	
	public void child1()
	{
		System.out.println(a);
		System.out.println(super.a);
	}

}
