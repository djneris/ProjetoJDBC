package br.cnec.fcsl.sistema;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.cnec.fcsl.gui.AlunoFrame;
import br.cnec.fcsl.persistencia.Conexao;

public class Principal {

	public static void main(String[] args) throws SQLException {
		// Inicia a aplica��o 
		if (Conexao.getConexao() == null) { 
			JOptionPane.showMessageDialog(null, "N�o h� conex�o com Banco de Dados");
			System.exit(0);
		}
		new AlunoFrame().setVisible(true);
	}

}