package multilevelinheritance;

public class Son extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Son s = new Son();
      s.grandfather1();
      s.father1();
      s.child1(10,20);
	}
	
	public void child1(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}

}
