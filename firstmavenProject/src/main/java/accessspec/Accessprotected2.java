package accessspec;
//calling protected class inside package & outside class


public class Accessprotected2 extends Accessprotected{
	public static void main(String[] args) {
		Accessprotected2 n = new Accessprotected2();// create obj ref for child class 
		n.method4();
	}

}
