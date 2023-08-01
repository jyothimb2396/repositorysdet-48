package Practice1;

import org.testng.annotations.Test;

public class Demo
{
	@Test(groups="smoke")
	public void bye()
	{
		System.out.println("bye");
	}
	@Test(groups="regression")
	public void good()
	{
		System.out.println("good");
	}

}
