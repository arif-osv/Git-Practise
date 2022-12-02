package com.qa.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class date {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

		Date currentDate = new Date();
		System.out.println(dateFormat.format(currentDate));
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 5);
		Date currentDatePluemonthssOne = c.getTime();
		String currentDat = dateFormat.format(currentDatePluemonthssOne);
		List<String> emonths =Arrays.asList(currentDat.split("\\s+"));
		emonths.set(0, String.valueOf(Integer.parseInt(emonths.get(0))));
		emonths.set(1, String.valueOf(Integer.parseInt(emonths.get(0))+2));
		emonths.set(2, String.valueOf(Integer.parseInt(emonths.get(0))+3));
		

		System.out.println("cb value"+ emonths.toString());

	}

}
