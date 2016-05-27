package br.com.cedrotech.extract;

import java.math.BigDecimal;

public class TestePad {

	public static void main(String[] args) {
		
		
		BigDecimal teste1 = new BigDecimal("900.98999999999999");
		BigDecimal teste2 = new BigDecimal("900.789");
		
		System.out.println(teste1.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		
		//System.out.println(LoadFilesSql.loadSqlFile("files/c3.txt"));
		
	}

}
