package br.com.padroes.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}