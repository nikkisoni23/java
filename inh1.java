class SprCls
{
	SprCls()
	{
		System.out.println("SUPER CLASS");
	}
	void displ()
	{
		System.out.println("display() of super class");
	}
}
class Sub extends SprCls
{
	Sub()
	{
		System.out.println("SUB CLASS");
	}
	public static void main(String s1[])
	{
		Sub s=new Sub();
		s.displ();
	}
}
