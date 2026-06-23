package hierarchical;

public class Son extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		s.father1();
		s.son1(10,20);

	}
	
	public void son1(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}

}
