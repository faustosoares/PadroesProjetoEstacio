package br.com.padroes.abstractfactory.exercicio;

public class Application {
	
	private Cadeira cadeira;
	private Sofa sofa;
	
	public Application(MoveisFactory factory) {
		sofa = factory.criarSofa();
		cadeira = factory.criarCadeira();
	}

    public void desenhar() {
        sofa.desenhar();
        cadeira.desenhar();
    }

}
