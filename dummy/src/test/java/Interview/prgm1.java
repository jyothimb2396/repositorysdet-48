package Interview;

import java.util.Arrays;
import java.util.Iterator;

public class prgm1 
{
	public static void main(String[] args)
	{
		int [] a= {5,1,2,3,4};
		int iteration=1;
		while(iteration-->0)
		{
			
//		for (int i = 0; i < iteration; i++)
		{
			for (int j = 0; j < a.length-1; j++) 
			{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
		}
		}
     System.out.println(Arrays.toString(a));		
	
	
	
	
	
//	for (int i = 0; i < a.length; i++) 
//	{
//		for (int a1 : a)
//		{
//			if (a1==a[i]) 
//			{
//				for (int j = i+1; j < a.length-1; j++) {
//					int temp = a[i];
//					a[i]=a[j+1];
//					a[j+1]=temp;
//				}
//				
//				
//			}
//			System.out.println(Arrays.toString(a));
//		}
		
//	}
	}
	

}
