package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingDate {

	public static void main(String[] args) {
		//Date class will get you the current System date
		Date d1=new Date();
		//SimpleDateFormat will help to get date in specific format
		SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
		//with the help of SimpleDateFormat you can convert your date into required format
		System.out.println(s.format(d1));
	}

}