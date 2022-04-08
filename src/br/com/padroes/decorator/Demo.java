package br.com.padroes.decorator;


/**
 * Este exemplo mostra como voc� pode ajustar o comportamento de um objeto sem alterar seu c�digo.
 *	Inicialmente, a classe de l�gica de neg�cio s� podia ler e gravar dados em texto sem formata��o. Em seguida, criamos v�rias pequenas classes de wrapper que adicionam novo comportamento ap�s a execu��o de opera��es padr�o em um objeto empacotado.
 *	O primeiro wrapper criptografa e descriptografa dados, e o segundo compacta e extrai dados.
 *	Voc� pode at� combinar esses inv�lucros envolvendo um decorador com outro.
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