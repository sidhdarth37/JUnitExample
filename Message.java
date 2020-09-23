
public class Message {
	String a="Hello";
	public String print()
	{
		return a;
	}
	
	public String printWithPrefix() throws InterruptedException
	{
		Thread.sleep(10000000);
		return "Hi "+a;
	}
}
