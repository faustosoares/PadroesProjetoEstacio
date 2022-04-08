package br.com.padroes.singleton;

public class Demo2 {

	
	public static void main(String[] args) {
		  UsuarioSingleton singleton = UsuarioSingleton.getInstance("Fausto");
		  UsuarioSingleton anotherSingleton = UsuarioSingleton.getInstance("João");
	      System.out.println(singleton.nome);
	      
	      System.out.println("Usuario Logado outro");
	      System.out.println(anotherSingleton.nome);
	}
}
