package ReadExcelData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Test {

	public static void main(String[] args) {
		

				List<Integer> list = new ArrayList<Integer>();
				list.add(0);
				list.add(1);
				list.add(2);

			System.out.println("#4 iterator");
				Iterator<Integer> iterator = list.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

		
	}
}


