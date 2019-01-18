package ReadExcelData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
		//	convertCharToString();
			printDuplicateString();
			//findUnique();
			//string();
			//Armstrong();
			//Charactercount();
			//arrayList();
			//eliminateDupWord();
			//swapWithoutThird();
		//	reverse();
			//reverseWords();
		//	text();
			//primeOrNot();
			//eliminatedupchar();
			//listExample();
			//printstar();
	}
		public static void text()
		{
			String str="ABCD";
			for(int i=0;i<str.length();i++)
			{
			System.out.println((char)(str.charAt(i)+1));
			}		
		}
		
		public static void eliminatedupchar() {
			
			String str="sseellinniuumm";
			char[] charlen=str.toCharArray();
			Set<Character> hs=new HashSet<Character>();
			StringBuilder sb=new StringBuilder();
			for(Character c:charlen)
			{
				if(!hs.contains(c))
				{
					hs.add(c);
					sb.append(c);
				}
			}
			System.out.println(sb.toString());
		
		
			
			
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
		
		public static void printstar()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
		public static void Charactercount(){
			String str="sravya reddy venati";
			int len=str.length();
			Map<Character, Integer> map=new HashMap<Character, Integer>();
			for(int i=0;i<len;i++)
			{
				char charAt=str.charAt(i);
				if(map.containsKey(charAt))
				{
					map.put(charAt,map.get(charAt));
				}
			}
		}
		
	//	output-{ =2, a=3, d=2, e=2, i=1, n=1, r=1, R=1, S=1, t=1, v=1, V=1, y=2}

		
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
		
		public static void arrayList()
		{
			
			int[] num={5,2,6,1,1,2,4};
			List<Integer> list=new ArrayList<Integer>();
			for(int x:num)
			{
				System.out.println(list.add(x));
			}
			
			
		}	
		public static void listExample()
		{
			
		//	int[] num={5,2,6,1,1,2,4};
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			Iterator ie=list.iterator();
			
			while(ie.hasNext())
			{
				System.out.println(ie.next());
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
		int n=127,m=0,flag=0,i;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime number");
			
		}
		else
			for(i=2;i<m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println(n+" is prime number");
		}
		
	}
	public static void reverseChars()
	{
  String str="selenium is not as easy as expected still hard work and commitment never faiils";
  int length=str.length();
  String rev="";
  for(int i=length-1;i>=0;i--)
  {
	  rev=rev+str.charAt(i);
  }
System.out.println("rev string:"+rev);
	}
	
	public static void reverseWords()
	{
  String str="selenium is not as easy as expected still hard work and commitment never faiils";
  String[] rstr=str.split(" ");
  System.out.println(rstr);
  int length=rstr.length;
  String rev="";
for(int i=length-1;i>=0;i--)
  {
	  rev=rev+rstr[i]+" ";
  }
System.out.println("rev string:"+rev);
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
		for(int i=2;i<10;i++)
		{
			n3=n1+n2;
			System.out.println( +n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void Armstrong()
	{
		int n=154, temp, sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
			if(temp==sum){
				System.out.println("Armstrong" +" "+sum);
				
			}
			else{
				System.out.println(+sum +" is Not Armstrong");
				
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
			int[] s1={1,4,4,5,6};
		//	String s2="ABC";
		//	String s3=new String(s1);
		//	List<Integer> list=Arrays.asList(s1);
		//    list.add(s1);
		//	StringBuffer sb=new StringBuffer();
		//	sb.append(s1);
		//	System.out.println( sb.toString()+"  " +s2 +" "+s3);
		//	System.out.println( s3);
			}
		public static void printDuplicateString()
		{
		String countries[]={"India","Japan","USA","UK","Japan", "India", "USA"};
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
		
		
		public static void swapWithoutThird()
		{
			int a=10;
			int b=20;
			a=a+b;
			System.out.println("Addition of a and b:"+a);
			b=a-b;
			System.out.println("Subtraction of a and b:"+b);
			a=a-b;
					System.out.println (+a);
					System.out.println(+b);
			
			//output-a=20 and b=10
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
