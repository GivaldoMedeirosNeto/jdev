package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/java_jdbc?noAccessToProcedureBodies=true";
	private static String user = "cursojava";
	private static String pass = "Cj@9#Lx2!Qp7$Mz4";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
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
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
