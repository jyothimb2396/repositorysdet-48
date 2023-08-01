package Practice1;

public class sdd11dcsd125ksdh526 {

	public static void main(String[] args) 
	{
		
		String s ="sdd11dcsd125ksdh526";//723250
		char[] c = s.toCharArray();
		for(int i=0; i<c.length;i++)
		{
			int sum = 1;
			if(Character.isDigit(c[i]))
			{
				System.out.print(c[i]);
			}
			System.out.println();
			//sum++;
			for(int j=1; j<c.length;j++)
			{
				sum=c[i]*c[i]*c[i];
				System.out.println(sum);
			}
		}

	}

}
