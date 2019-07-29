package com.sample;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Timezonecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime local = LocalDateTime.now();
		Calendar c1 = Calendar.getInstance();
		c1.set(local.getYear(), local.getMonthValue(), local.getDayOfMonth(), local.getHour(), local.getMinute(), local.getSecond());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		System.out.println(sdf.format(c1.getTime()));

		Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		c1.set(local.getYear(), local.getMonthValue(), local.getDayOfMonth(), local.getHour(), local.getMinute(), local.getSecond());
		System.out.println(sdf.format(c2.getTime()));
	}

}
