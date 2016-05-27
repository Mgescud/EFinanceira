package br.com.cedrotech.extract;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoadFiles {
	
	public static String loadSql (String pathStr) {
		Path path = Paths.get(pathStr);
		List<String> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		
		try {
			Stream<String> stream = Files.lines(path); 
			list = stream.collect(Collectors.toList());
			
			for (String str : list) {
				sql.append(str).append("\n");
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sql.toString();
	}

}
