package br.com.padroes.prototype.exercicio;

public class Carro extends Transporte {
    public String chassi;
    

    public Carro() {
    }

    public Carro(Carro target) {
        super(target);
        if (target != null) {
            this.chassi.equals(chassi);
            
        }
    }

    @Override
    public Transporte clone() {
        return new Carro(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Carro) || !super.equals(object2)) return false;
        Carro shape2 = (Carro) object2;
        return shape2.chassi.equals(chassi);
    }

	@Override
	public String toString() {
		return "Carro [chassi=" + chassi + "]";
	}
    
    
}