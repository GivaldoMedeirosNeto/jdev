package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/curso-jsp?noAccessToProcedureBodies=true";
	private static String user = "root";
	private static String pass = "Db4G1v4ld0@85";
	private static Connection connection = null;
	
	public SingleConnection() {
		conectar();
	}
	
	static {
		conectar();
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	private static void conectar() {
		
		try {
			
			if(connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, pass);
				connection.setAutoCommit(false);
				System.out.println("conexão realizada.");
			}
			
		} catch (Exception e) {
			System.out.println("Erro na conexão.");
			e.printStackTrace();
		}
		
	}

}
