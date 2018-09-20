package ReadExcelData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;

public class JavaPrograms {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
           //sortNumber();
			//numberLess();
			//duplicate();
			//oddNumber();
			//primeOrNot();
			//sortGiven();
			//fibonacci();
			//eliminateStringDuplicate();
			//compareStringIgnoreCase();
			//convertCharToString();
			//printDuplicateString();
			//findUnique();
			//string();
			//Armstrong();
			Charactercount();
	}
		
		public static void eliminatedupchar() {
			String str="hello world prog ram";
			char[] charAt=str.toCharArray();
			Set<Character> hs=new LinkedHashSet<Character>();
			StringBuffer sb=new StringBuffer();
			for(Character c : charAt )
		    {
		        if(!hs.contains(c))
		        {
		            hs.add(c);
		            sb.append(c);
		            //System.out.print(c);
		        }
		    }

		            System.out.print(sb.toString());
		    
		}
		public static void eliminateDupWord(){
		String str="hello hello hello world program";//eliminate duplicate words in string
		String[] word=str.split(" ");
		int length=word.length;
		str = " ";
		HashSet<String> hs= new HashSet<String>();
		for(String x:word){
			if(hs.add(x)==true)
			{
				str=str+x+" ";
				}
			}

		System.out.println(str);
		}
		public static void Charactercount(){
		String str="Sravya Reddy Venati";
		int len=str.length();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<len;i++)
		{
			char charAt=str.charAt(i);
			if(!map.containsKey(charAt))
			{
				map.put(charAt, 1);
			}
			else
			{
				map.put(charAt,map.get(charAt)+1);
			}
		}
		System.out.println(map);
}
	public static void sortNumbers()
	{
		
		int num[]={5,2,6,1,1,2,4};
		for (int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]>num[j+1])
						{
					      int temp=num[j+1];
					      num[j+1]=num[j];
					      num[j]=temp;
					    
						}
				
			}
		}
		
		for(int i=0;i<num.length;i++){
		  System.out.println(num[i]+"");
		}
	}	
		
	/*	ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(4);
		System.out.println("numbers in " +al);
		*/

		
	
	public static void sortNumber()
	{
		
		int num[]={5,2,6,1,9,8,5,0,3};
		for (int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					      int temp=num[j];
					      num[j]=num[i];
					      num[i]=temp;
					    
				}
					
					/*{
				      int temp=num[j];
				      num[j]=num[i];
				      num[i]=temp;
				    
					}*/
				
			}
		}
		
		for(int i=0;i<num.length;i++){
		  System.out.println("values"+num[i]);
		}
	}
	
	public static void numberLess()
	{
		int val[]={2,40,35,1,3,15,8};
		
		for(int i=0;i<val.length;i++)
		{
			if(val[i]<5||val[i]%2==0){
				System.out.println("numbers"+val[i]);
			}
			
		}
		
	}
	public static void duplicate()
	{
		int[] val={1,5,5,6,2,6,7,2};
		
		Set<Integer> set=new HashSet<Integer>();
		
		{
			
		}
		for (int i=0;i<val.length-1;i++)
		{
			for(int j=i+1;j<val.length;j++)
			{
				if((val[i]==val[j])&&(i!=j))
				{
					System.out.println("Unique elements"+val[j]);
				
				}
			}
		
		}
		
	}
	public static void oddNumber()
	{
		int n=100;
		for(int i=0;i<=n;i++)
		{
			if(i%2==1&&i%3==0){
				System.out.println("odd numbers that are divisible by 3="+i);
			}
		}
	}
	public static void primeOrNot()
	{
		int n=29,m=0,flag=0,i;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime");
		}
		else
		{
			for (i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0){
			System.out.println(n+"is prime number");
		}
		}
	}
	public static void reverse()
	{
		int n=12345;
		int rev=0;
		
		{
			
		}
	}
	public static void eliminateStringDuplicate()
	{
		
		String str="sravyareddyvenati";
		Set<Character> set= new HashSet<Character>();
		StringBuffer sf=new StringBuffer();		
		
		for (int i=0;i<str.length();i++)
			
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
		}
			
		System.out.println("value "+sf.toString());		
							
			
		}
		 
	
	public static void fibonacci()
	{
		int n1=0,n2=1,n3;
		System.out.println("Fibonacci series"+n1 +n2);
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;
			System.out.println( +n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void Armstrong()
	{
		int n=153, temp, sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
			
		}
		if(temp==sum){
			System.out.println("Armstorng"+sum);
			
		}
		
	
	}
		public static void compareStringIgnoreCase()
		{
			String s1="abc";
			String s2="ABC";
			Assert.assertTrue(s1.equalsIgnoreCase(s2));
			System.out.println( s1+" is equal to " +s2 +" --ignoring case");
			}
		public static void convertCharToString()
		{
			char s1[]={'S','t','r','i','n','g'};
			String s2="ABC";
			String s3=new String(s1);
		//	StringBuffer sb=new StringBuffer();
		//	sb.append(s1);
		//	System.out.println( sb.toString()+"  " +s2 +" "+s3);
			System.out.println( s3);
			}
		public static void printDuplicateString()
		{
		String countries[]={"India","Japan","USA","UK","Japan"};
		for(int i=0;i<countries.length;i++)//to iterate through string
		{
			for(int j=i+1;j<countries.length;j++)//to compare values
			{
				if(countries[i]==countries[j]&&(i!=j))//condition to compare
				{
					System.out.println("Duplicate exists"+countries[i]);//to print duplicate string
				}
			}
		}
		
		}
		public static void string()
	    {
			
			String s1 = new String("abcd");
            String s2 = new String("ABCD");
            String s3= "sravya";
            String s4="";
          //  System.out.println("Compares:"+s4.compareToIgnoreCase(s1));
         //   System.out.println("is Empty functionality" +s4.isEmpty());
            System.out.println(s1=s2);
         //   System.out.println(40+40+"string"+(40+40));
            String a1 = "abc";
    		String a2 = "abc";
    	//	System.out.println("a1 == a2 is:" + a1 == a2);
         /*   int a=10;
            char ch1=s3.charAt(6);
           			System.out.println("index value:"+ch1);
            System.out.println(s1.equals(s2));//returns false
            System.out.println(s1.equalsIgnoreCase(s2));//returns true
            System.out.println(s1+s2);
            System.out.println(40+40+"string"+40+40);
            System.out.println(s1.substring(3,4));
			String s=String.valueOf(a);
			System.out.println(s+10);
			StringBuilder sb=new StringBuilder(s3);
			sb.reverse();
			System.out.println("output:"+sb.toString());
			char ch[]=s4.toCharArray();
			String rev="";
			for (int i=ch.length-1;i>=0;i--){
				rev+=ch[i];
			}
			
			System.out.println("reverse::"+rev);*/
		
}
}
