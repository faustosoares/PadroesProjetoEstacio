package br.com.padroes.adapter.exercicio;

//Adapter
public class AdapterEntrada  extends EntradaXLR
{
    private EntradaP10 entradaP10;

    public AdapterEntrada(EntradaP10 entradaP10)
    {
        this.entradaP10 = entradaP10;
    }

    //Solicitação
    public void conectarEntradaXLR()
    {
        entradaP10.conectarEntradaP10();
    }
}