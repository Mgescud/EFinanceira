package br.com.cedrotech.extract;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoadFiles {
	
	public static String loadSql (String pathStr) {
		Path path = Paths.get(pathStr);
		List<String> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		
		try {
			list = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (String str : list) {
				sql.append(str).append("\n");
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sql.toString();
	}

}
