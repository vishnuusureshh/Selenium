package ReadExcelData;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
public class SampleJava {
	
		    public static void main(String args[]){
	        FileReader fr = null;
	        FileWriter fw = null;
	        ArrayList<String> list = new ArrayList<String>();
	        try {
	            fr = new FileReader("C:\\Users\\u44728\\Desktop\\sample.txt");
	            fw = new FileWriter("C:\\Users\\u44728\\Desktop\\sample1.txt");
	            
	            BufferedReader br = new BufferedReader(fr);
	            String str = null;
	            while( (str=br.readLine()) != null){
	            	System.out.println(str);
	            	list.add(str);
	            }
	            br.close();
	            System.out.println("------------------ Reverse -----------------------");
	            String s = null;
	            for(int j=list.size()-1;j>=0;j--) {
	            	s = list.get(j);
	            	System.out.println(new StringBuffer(s).reverse());
	            }
	            	
	            
	           /* LineNumberReader lineReader = new LineNumberReader(new FileReader(Paths
	                    .get("C:\\Users\\u44728\\Desktop\\sample.txt").toFile()));
	            lineReader.skip(Long.MAX_VALUE);
	            int totalNumberOfLines = lineReader.getLineNumber() + 1;
	            System.out.println("number of lines:"+totalNumberOfLines);
	                  
	            
	            int c = fr.read();
	            
	            		while(c!=-1) {
	                fw.write(c);
	                c = fr.read();
	            }*/
	        } catch(IOException e) {
	            e.printStackTrace();
	        } finally {
	            close(fr);
	            close(fw);
	        }
	    }
	    public static void close(Closeable stream) {
	        try {
	            if (stream != null) {
	                stream.close();
	            }
	        } catch(IOException e) {
	            //...
	        }
	    }
	}