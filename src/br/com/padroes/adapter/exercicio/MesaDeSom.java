package br.com.padroes.adapter.exercicio;

public class MesaDeSom
{
    public static void main(String[] args)
    {
        EntradaP10 p10 = new EntradaP10();
        AdapterEntrada adaptador = new AdapterEntrada(p10);
        
        // O adaptador recebe o cabo e ele mesmo faz a conexão a mesa
        adaptador.conectarEntradaXLR();
    }
}