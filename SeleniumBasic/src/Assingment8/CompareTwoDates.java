package Assingment8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTwoDates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub 
		//create simple date format object with required date pattern
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//create two date objects
		Date d1 = format.parse("2022-12-26");/**parse converts one dt into another dt*/
		Date d2 = format.parse("2022-12-28");
		// call compare to method on date object
		if(d1.compareTo(d2)>0)
		{
			System.out.println("Date 1 occurs after date 2");
		}
		else if (d1.compareTo(d2)<0)
		{
			System.out.println("Date 1 occurs before date 2");
		}
		else if (d1.compareTo(d2)==0)
		{
			System.out.println("Both dates are same");
		}
	}
}
