package com.estudo.aula26022024.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.estudo.aula26022024.conexao.FabricaDeConexao;
import com.estudo.aula26022024.entities.Funcionario;

public class FuncionarioDao {
	
	// a conexão com o banco de dados
		private Connection connection;

		public FuncionarioDao() {
			this.connection = new FabricaDeConexao().getConnection();
		}
		
		public void insereFUncionario(Funcionario funcionario) {
			String sql = "insert into funcionarios (nome_completo, matricula, id_departamento) values (?,?,?)";
			try {
				// prepared statement para inserção
				PreparedStatement stmt = connection.prepareStatement(sql);
				// seta os valores
				stmt.setString(1, funcionario.getNomeCompleto());
				stmt.setString(2, funcionario.getMatricula());
				stmt.setLong(3, funcionario.getId_departamento());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
		}
		
		

}
