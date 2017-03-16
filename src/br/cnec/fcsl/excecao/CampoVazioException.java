package br.cnec.fcsl.excecao;

public class CampoVazioException extends Exception { //exceção para o campo vazio
	@Override
	public String getMessage() {
		return "Favor preencher todos os campos.";
	}

}
