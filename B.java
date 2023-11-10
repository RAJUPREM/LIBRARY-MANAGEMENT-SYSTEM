
public class B implements A{

	@Override
	public void show() {
		System.out.println("I am show method");
		
	}

}


class M
{
	public static void main(String [] args)
	{
		B b=new B();
		b.show();
		
		A bb=new B();
		bb.show();
	}
	
}
