package br.com.cedrotech.extract;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.text.StrBuilder;

public class LoadFiles {
	
	public static String loadSql (String pathStr) {
		Path path = Paths.get(pathStr);
		List<String> list = new ArrayList<>();
		StrBuilder sql = new StrBuilder();
		
		try {
			list = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (String str : list) {
				sql.append(str);		
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sql.toString();
	}

}
