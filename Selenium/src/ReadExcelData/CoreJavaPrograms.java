package ReadExcelData;

public class CoreJavaPrograms {

	public static void main(String Args[])
	{
		//reverseNumber();
		//primeNumber();
		//maxValues();
	   //stringBuffer();
		reverse();
	}
	
	public static void reverseNumber()
	{
		int n=12345, temp, r,sum=0;
		temp=n;
		while(n>0)
		{
		r=n%10;//5
		sum=sum*10+r;
		n=n/10;//1234
		}
		System.out.println(+sum);
		
	}
	
	public static void stringBuffer()
	{
	String str="sravya";
	int len=str.length();
	String rev="";
	for(int i=len;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	//StringBuffer sb=new StringBuffer(str);
	System.out.println(rev);
		}
	
	public static void maxValues()
	{
		int[] values={20,10,9,21,13};
		int len=values.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
			if(values[i]>values[j])
			{
				int temp=values[i];
				values[i]=values[j];
				values[j]=temp;
		
			}
				
		}
	}
		System.out.println(values[len-3]);
}
	public static void reverse()
	{
		String str="Selenium";
		int len=str.length();
		String rstr="";
		for(int i=len-1;i>=0;i--)
		{
			rstr=rstr+str.charAt(i);
		}
		System.out.println(rstr);
	}
}
