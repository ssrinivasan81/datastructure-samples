package com.sample;

import java.time.LocalDateTime;
import java.util.Calendar;

public class TestCronTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hour = "10";
		String minute = "30";
		String day = "2" ;//"Monday";
		String period = "month";
		String periodFrequency = "3";
		String whiteSpaces = " ";
		String cronExp = "";
		String currentMonth = "4";
		String questionMark = "?";
		String slash = "/";
		String hash = "#";
		Calendar.getInstance().getTime();
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) +"-----"+LocalDateTime.now());
		if ("month" .equalsIgnoreCase(period)) {
			cronExp = "0" + whiteSpaces + minute +  whiteSpaces + hour + whiteSpaces + questionMark + whiteSpaces ;
			cronExp += currentMonth + slash + periodFrequency+whiteSpaces;
			cronExp += day +hash+"1" + whiteSpaces + "*"; // Every First Monday
		} else if ("week" .equalsIgnoreCase(period)) {
			cronExp = "0" + whiteSpaces + minute +  whiteSpaces + hour + whiteSpaces + questionMark + whiteSpaces ;
			cronExp += periodFrequency+slash+currentMonth + whiteSpaces;
			cronExp += day +hash+"1" + whiteSpaces + "*";
		}
		
		System.out.println("Cron Exp::"+cronExp);
	}

}
