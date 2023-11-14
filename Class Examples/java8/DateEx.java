package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
//		Date date = new Date();
//		
//		System.out.println(date);
		
//		LocalDate localdate = LocalDate.now();
//		
//		System.out.println(localdate.getDayOfYear());
//	
//		System.out.println(localdate.isLeapYear());
//		
//		System.out.println(localdate);
		
//		LocalTime localtime= LocalTime.now();
//		
//		System.out.println(localtime);
//		
//		
		//age calculator
		
//		LocalDate birthdate = LocalDate.of(2017, 12, 12);
//		
//		LocalDate currentdate = LocalDate.now();
//		
//		Period p = Period.between(birthdate, currentdate);
//		
//		System.out.printf("ur age is:-%d years,%d months,%d days",p.getYears(),
//				
//				p.getMonths(),p.getDays());
//		
//		System.out.println();
//		//date and time at zones
//		
		ZoneId zone=ZoneId.of("America/New_York");
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
//		System.out.println(zone.getAvailableZoneIds());
		
		
		
		System.out.println(zt);
//		
//		
		
		
		
		
		
		
	}

}
