package br.com.padroes.decorator;


/**
 * Este exemplo mostra como você pode ajustar o comportamento de um objeto sem alterar seu código.
 *	Inicialmente, a classe de lógica de negócio só podia ler e gravar dados em texto sem formatação. Em seguida, criamos várias pequenas classes de wrapper que adicionam novo comportamento após a execução de operações padrão em um objeto empacotado.
 *	O primeiro wrapper criptografa e descriptografa dados, e o segundo compacta e extrai dados.
 *	Você pode até combinar esses invólucros envolvendo um decorador com outro.
 * 
 *
 */
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}