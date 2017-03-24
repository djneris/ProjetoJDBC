package br.cnec.fcsl.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	// Classe para conexao ao banco de dados
	public static Connection getConexao() {

		try {
			Connection conexao = DriverManager.getConnection(
					"jdbc:sqlserver://server7l.database.windows.net:1433;database=db_lp3;user=danilo@server7l;"
					+ "password={nti#2017};encrypt=true;trustServerCertificate=false;"
					+ "hostNameInCertificate=*.database.windows.net;loginTimeout=30");
			return conexao;
		} catch (Exception e) {
			// e.printStackTrace();
			return null;
		}
	}
}