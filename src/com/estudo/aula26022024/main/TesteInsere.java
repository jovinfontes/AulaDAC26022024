package com.estudo.aula26022024.main;

import com.estudo.aula26022024.dao.DepartamentoDao;
import com.estudo.aula26022024.dao.FuncionarioDao;
import com.estudo.aula26022024.entities.Departamento;
import com.estudo.aula26022024.entities.Funcionario;

public class TesteInsere {

	public static void main(String[] args) {
		// pronto para gravar
		//Departamento departamento = new Departamento();
		//departamento.setNomeDepartamento("Administração");*/

		// grave nessa conexão!!!
		DepartamentoDao depDao = new DepartamentoDao();
        
		Departamento dep = depDao.byId(2L);
		// método elegante
		//depDao.insereDepartamento(departamento);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeCompleto("José Eduardo");
		funcionario.setMatricula("123.458-FA");
		funcionario.setId_departamento(dep.getId());
		
		FuncionarioDao funDao = new FuncionarioDao();
		funDao.insereFUncionario(funcionario);

		System.out.println("Gravado!");

	}

}
