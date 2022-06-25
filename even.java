class even
{
	public static void main(String[] args)
	{
		for(int j=2;j<100;j++)
		{
		
			int n=j;
			boolean flag=true;
			for (int i=2;i<n;i++ )
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				System.out.println("prime no "+n);
			}
			else
			{
			
				System.out.println("prime not "+n);
			}
		}
	}


}