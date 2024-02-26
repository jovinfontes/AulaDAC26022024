package com.estudo.aula26022024.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/teste", "postgres", "123456");
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
