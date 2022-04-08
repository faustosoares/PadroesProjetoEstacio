package br.com.padroes.factorymethod.exercicio;

public abstract class Aplicacao {
	
	  public void abrirDocumento() {
	      	Documento doc = criarDocumento();
		    doc.abrir();     
	        
	    }

	
    public abstract Documento criarDocumento();


}
