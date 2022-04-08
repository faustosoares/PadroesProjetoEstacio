package br.com.padroes.singleton;

public final class UsuarioSingleton {
	
	public String nome;
	private String login;
	private String senha;
	
    private static UsuarioSingleton instance;

    private UsuarioSingleton(String nome) {
       
        this.nome = nome;
    }
    
    public static UsuarioSingleton getInstance(String nome) {
        if (instance == null) {
            instance = new UsuarioSingleton(nome);
        }
        return instance;
    }
	
	

}
