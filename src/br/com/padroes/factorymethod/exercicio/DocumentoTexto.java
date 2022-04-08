package br.com.padroes.factorymethod.exercicio;

public class DocumentoTexto implements Documento {

	@Override
	public void abrir() {
		System.out.println("Olá! Eu sou um documento de TEXTO");
		
	}

}
