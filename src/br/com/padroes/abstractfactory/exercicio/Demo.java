package br.com.padroes.abstractfactory.exercicio;


public class Demo {

    private static Application configureApplication() {
        Application app;
        MoveisFactory factory;
       
       factory = new MoveisModernosFactory();
       app = new Application(factory);
       return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.desenhar();
    }
}