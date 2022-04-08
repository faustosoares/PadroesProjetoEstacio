package br.com.padroes.factorymethod.exercicio;

public class MinhaAplicacao extends Aplicacao{

	@Override
	public Documento criarDocumento() {
		return new DocumentoTexto();
	}

}
