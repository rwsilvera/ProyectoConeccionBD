package Controlador;

import java.sql.Connection;

import Modelo.DataBaseManager;

public class Main {

	public static void main(String[] args) {
		Connection connection = DataBaseManager.getConnection();
		System.out.println("Hola estoy es GIT");

	}

}
