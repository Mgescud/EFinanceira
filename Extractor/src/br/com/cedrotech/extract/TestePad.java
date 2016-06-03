package br.com.cedrotech.extract;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;


public class TestePad {

	public static void main(String[] args) {
	/*	System.out.println(LoadFiles.loadSql("files/c3.txt"));
		
		System.out.println(StringUtils.substring("ab", 0, 1));
		
		System.out.println(Utils.getNameFile(new Date(), FormatFile.MENSAL));
		
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 0, 31);
		Date data = cal.getTime();
		
		System.out.println(DateUtils.addDays(data, 1));*/
		System.out.println(StringUtils.leftPad("08715780694", 14, "0" ));
	}

}
