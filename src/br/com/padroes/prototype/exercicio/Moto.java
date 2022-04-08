package br.com.padroes.prototype.exercicio;
public class Moto extends Transporte {
    public String escapamento;

    public Moto() {
    }

    public Moto(Moto target) {
        super(target);
        if (target != null) {
            this.escapamento = target.escapamento;
        }
    }

    @Override
    public Transporte clone() {
        return new Moto(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Moto) || !super.equals(object2)) return false;
        Moto shape2 = (Moto) object2;
        return shape2.escapamento.equals(escapamento);
    }

	@Override
	public String toString() {
		return "Moto [escapamento=" + escapamento + "]";
	}
    
    
}