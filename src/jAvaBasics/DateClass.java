package jAvaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(d.toString());
		
	}

}
