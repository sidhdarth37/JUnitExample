

public class Calc {
	public int calcSum(int a , int b)
	{
		return a+b;
	}
	public int calcDiff(int a,int b)
	{
		return a-b;
	}
	public int calcDiv(int a,int b)
	{
		return a/b;
	}
	public int calcMult(int a,int b)
	{
		long l=((long)( a))*b;
		if(l>Integer.MAX_VALUE)
			throw new ArithmeticException();
		return a*b;
	}
}
