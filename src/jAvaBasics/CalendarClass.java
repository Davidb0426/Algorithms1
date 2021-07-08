package jAvaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.AM_PM));
		

	}

}
