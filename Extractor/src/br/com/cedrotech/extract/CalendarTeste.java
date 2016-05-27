package br.com.cedrotech.extract;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTeste {

	public static void main(String[] args) {
		
		Calendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, 2015);
        gc.set(Calendar.MONTH, 3);
        gc.set(Calendar.DAY_OF_MONTH, 1);
        Date monthStart = gc.getTime();        
       
        gc.add(Calendar.MONTH, 1);
        gc.add(Calendar.DAY_OF_MONTH, -1);
        Date monthEnd = gc.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        System.out.println("Calculated month start date : " + format.format(monthStart));
        System.out.println("Calculated month end date : " + format.format(monthEnd));
	}

}
