package br.cnec.fcsl.excecao;

public class CampoVazioException extends Exception { //exce��o para o campo vazio
	@Override
	public String getMessage() {
		return "Favor preencher todos os campos.";
	}

}
