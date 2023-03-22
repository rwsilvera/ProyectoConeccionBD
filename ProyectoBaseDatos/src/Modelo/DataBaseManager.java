package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
	private static Connection databaseConnection;

	private static String CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USUARIO = "TRABAJO_C";
	private static String CLAVE = "TRABAJO_C";

	static {
		databaseConnection = null;

		try { // tenemos vinculada la clase en nuestro proyecto?
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Se encontro el Driver para Oracle DB - La libreria necesaria esta referenciada");
			try {// intentamos instanciar el objeto connection
				databaseConnection = DriverManager.getConnection(CONNECTION_STRING, USUARIO, CLAVE);

				System.out.println("Conexión creada con éxito, es posible acceder a la base de datos!");

			} catch (SQLException e) {
				System.out.println("No logramos instanciar una conexión!!");
				e.printStackTrace();
			} // try { intentamos instanciar el objeto connection

		} catch (ClassNotFoundException e) {
			System.out.println("No tienes el dirver en tu build-path");
			e.printStackTrace();
		} // tenemos vinculada la clase en nuestro Proyecto?

	}

	public static Connection getConnection() {
		return databaseConnection;

	}

}
