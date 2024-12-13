package Concessionaria;

public class Carro {
    String placa;
    Modelo modelo;
    int anoDeFabricacao;

    public Carro() {
    }

    public Carro(String placa, Modelo modelo, int anoDeFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void exibirDetalhes()
    {
        System.out.println("Placa: " + getPlaca() + " Modelo: " + getModelo().nomeModelo + " Ano de Fabricação: " + getAnoDeFabricacao() + " Montadora: " + modelo.montadora.getRazaoSocial());
        System.out.println();
    }
}
