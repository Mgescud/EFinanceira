package br.com.cedrotech.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.pool.OracleDataSource;

import org.apache.log4j.Logger;

/**
 * Classe para estabelecer conexão com o banco de dados
 * 
 * @author Allan Borges
 *
 */
public class Conexao {
	
	private static String URL_CONNECTION = "jdbc:oracle:thin://@10.12.29.204:1521/cleardsv";
	private static String USER_CONNECTION = "clear";
	private static String PASSWORD_CONNECTION = "clear";
	public static Connection conn;
	final static Logger logger = Logger.getLogger(Conexao.class);
	
	static {
		
		try {
			InputStream in = new FileInputStream("conexao.properties");
		    Properties prop = new Properties();
		    prop.load(in);		    
		    URL_CONNECTION = prop.getProperty("url");
		    USER_CONNECTION = prop.getProperty("user");
		    PASSWORD_CONNECTION = prop.getProperty("password");
		} catch (FileNotFoundException ex) {
			logger.error("Falha na abertura do arquivo de dados de conexão " + ex.getMessage());
		} catch (IOException ex) {
			logger.error("Não foi possível conectar no banco " + URL_CONNECTION);
		}

	}
	
	public static void main(String[] args) {
		
	}
	
	public static Connection getConexao() throws SQLException {			
		try {
			if (conn == null || conn.isClosed()) {
				OracleDataSource ods = new OracleDataSource();
				ods.setURL(URL_CONNECTION);
				ods.setUser(USER_CONNECTION);
				ods.setPassword(PASSWORD_CONNECTION);
			    conn = ods.getConnection();					
			}
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Não foi possível conectar no banco " + URL_CONNECTION + e.getMessage());
			
			throw new SQLException();
		}
	}
	
	public static void fechaConexao() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
