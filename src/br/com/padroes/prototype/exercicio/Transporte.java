package br.com.padroes.prototype.exercicio;

import java.util.Objects;

public abstract class Transporte {
    public int anoFabricacao;
    public String cor;
    

    public Transporte() {
    }

    public Transporte(Transporte target) {
        if (target != null) {
            this.anoFabricacao = target.anoFabricacao;
            this.cor = target.cor;
        }
    }

    public abstract Transporte clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Transporte)) return false;
        Transporte shape2 = (Transporte) object2;
        return shape2.anoFabricacao == anoFabricacao  && Objects.equals(shape2.cor, cor);
    }
}