package ReadExcelData;

import java.util.HashMap;
import java.util.Map;

public class Practicecode {
	
public static void main(String[] args)
	{
	String str="sravya reddy venati";
	int len=str.length();
	Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<len;i++){
			
			char charlen=str.charAt(i);
		if(map.containsKey(charlen))
		{
			map.put(charlen, map.get(charlen)+1);
		}
		else{
			map.put(charlen, 1);
		}
	}
		System.out.println(map);
	
	}

}
	
	
	
	
	
	
	
