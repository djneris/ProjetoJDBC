package br.cnec.fcsl.sistema;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.cnec.fcsl.gui.AlunoFrame;
import br.cnec.fcsl.persistencia.Conexao;

public class Principal {

	public static void main(String[] args) throws SQLException {
		// Inicia a aplicação 
		if (Conexao.getConexao() == null) { 
			JOptionPane.showMessageDialog(null, "Não há conexão com Banco de Dados");
		}
		new AlunoFrame().setVisible(true);
	}

}