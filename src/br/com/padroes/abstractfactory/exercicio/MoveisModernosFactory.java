package br.com.padroes.abstractfactory.exercicio;

public class MoveisModernosFactory implements MoveisFactory{

	@Override
	public Sofa criarSofa() {
		return new SofaModerno();
	}

	@Override
	public Cadeira criarCadeira() {
		return new CadeiraModerna();
	}

}
