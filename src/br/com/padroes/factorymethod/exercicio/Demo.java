package br.com.padroes.factorymethod.exercicio;

public class Demo {
	
    private static Aplicacao aplicacao; //F�BRICA
    
    public static void main(String[] args) {
		aplicacao = new MinhaAplicacao();
		
		aplicacao.abrirDocumento();
		
	}


}
