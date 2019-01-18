package ReadExcelData;

public class Encapsulation {
	  
	   public static void main(String[] Args)
	   {
		   Encapsulationdemo obj=new Encapsulationdemo();
		   obj.setEmpAge(25);
		   obj.setEmpName("sravya");
		   System.out.println("Employee Age:"+obj.getEmpAge());
		   System.out.println("Employee Name:"+obj.getEmpName());
	   }
	}
