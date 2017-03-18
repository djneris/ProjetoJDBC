package br.cnec.fcsl.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	//Classe para conexao ao banco de dados
	public static Connection getConexao() {

		try {
			Class.forName(ParametrosMySql.DRIVER);
			Connection conexao = DriverManager.getConnection(ParametrosMySql.URL, ParametrosMySql.USUARIO,
					ParametrosMySql.SENHA);
			return conexao;
		} catch (Exception e) {
			//e.printStackTrace();
			return null;
		}
	}
}