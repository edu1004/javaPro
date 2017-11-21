package test.com;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test01Date {

	public static void main(String[] args) {
		System.out.println("date...");
		System.out.println(System.currentTimeMillis());
		
		//java.util
		Date d = new Date();
		System.out.println(d);
		
//		Calendar cal = Calendar.getInstance(); 
//		System.out.println(cal.getTimeInMillis());
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.AM_PM)+":"+cal.get(Calendar.HOUR));
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//		System.out.println(cal.get(Calendar.MINUTE));
//		System.out.println(cal.get(Calendar.SECOND));
		
		
		GregorianCalendar cal = new GregorianCalendar();
		cal = new GregorianCalendar(2002,1-1,2,3,4,5);
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM)+":"+cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		
		//java.sql
		java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(d2);
		System.out.println(d2.getTime());
		
		java.sql.Timestamp tt = new java.sql.Timestamp(System.currentTimeMillis());
		System.out.println(tt);
		System.out.println(tt.getTime());
		
	}

}
