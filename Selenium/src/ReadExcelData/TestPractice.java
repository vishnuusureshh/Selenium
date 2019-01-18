package ReadExcelData;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestPractice {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="helloworldprogram";//eliminate duplicate words in string
		char[] charAt=str.toCharArray();
		int len=charAt.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(charAt[i]==charAt[j]){
					charAt[j]=charAt[i];
					j++;
					}
				charAt[j]=charAt[len-1];
				System.out.println(charAt[]);
				}
			//System.out.println();
			}
		
	//	for(int i=0;i<len;i++){
	
//			System.out.println(charAt[i]);
		}*/
	
	
	
	public static void main(String[] args) {
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

}
