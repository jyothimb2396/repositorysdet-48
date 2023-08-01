package Practice1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericsBank.Listenrutility;
@Listeners(Listenrutility.class)
public class Distributedprgm 
{
	@Test
	public void prgram1()
	{
		System.out.println("prgm 1 is executed");
	}
	@Test
	public void login()
	{
		
		System.out.println("prgm 1 is executed");
	}
	@Test
	public void prgram2()
	{
		System.out.println("prgm 2 is executed");
	}
	@Test
	public void prgram3()
	{
		System.out.println("prgm 3 is executed");
	}
	@Test
	public void prgram4()
	{
		System.out.println("prgm 4 is executed");
	}
	@Test
	public void prgram5()
	{
		System.out.println("prgm 5 is executed");
	}
	@Test
	public void prgram6()
	{
		System.out.println("prgm 6 is executed");
	}
	

}
