package br.com.cedrotech.extract;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	

	public static void main(String[] args) {
			
		BigDecimal b = new BigDecimal("5").setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println(b.toString());
		
		System.out.println(parseDateToString(new Date()));
	}
	
	public static String getNumberFormated (String number) {
		if (number.indexOf(".") == -1 || number.split("\\.")[1].length() == 1) {
			BigDecimal bigDecimalConvert = new BigDecimal(number);
			bigDecimalConvert = bigDecimalConvert.setScale(2, BigDecimal.ROUND_DOWN);	
			number = bigDecimalConvert.toString();
		}
		return number;
	}

	public static String parseDateToString (Date date) {		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
		
	}
	
	public static String getNameFile (Date date, FormatFile format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format.getFormat());
		return sdf.format(date);
	}
	
}
