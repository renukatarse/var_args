package var_args;

public class Test {
	public static void m1(int...x)
	{
	System.out.println("var args is");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30);
	}

}
