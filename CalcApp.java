
public class CalcApp {
	CalcService calcService;
	public int add(int a,int b)
	{
		return calcService.add(a, b);
	}
	public int sub(int a,int b)
	{
		return calcService.sub(a, b);
	}
	public int mult(int a,int b)
	{
		return calcService.mult(a, b);
	}
	public int div(int a,int b)
	{
		return calcService.div(a, b);
	}
}
