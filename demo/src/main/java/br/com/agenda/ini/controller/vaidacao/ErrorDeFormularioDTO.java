package br.com.agenda.ini.controller.vaidacao;

public class ErrorDeFormularioDTO {

	private String nomeErro;
	private String erro;
	
	public ErrorDeFormularioDTO(String nomeErro, String erro) {
		super();
		this.nomeErro = nomeErro;
		this.erro = erro;
	}

	public String getNomeErro() {
		return nomeErro;
	}

	public String getErro() {
		return erro;
	}
	
}
