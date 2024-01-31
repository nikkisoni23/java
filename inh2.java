class SprCls
{
	SprCls()
	{
		System.out.println("super class");
	}
	SprCls(String nm)
	{
		System.out.println(nm);
	}
	SprCls(int nm)
	{
		System.out.println(nm);		
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
		super(111);
		System.out.println("sub class");
	}
	void displ()
	{
		System.out.println("display() of sub class");
	}
	public static void main(String s1[])
	{
		Sub s=new Sub();
		s.displ();
	}
}