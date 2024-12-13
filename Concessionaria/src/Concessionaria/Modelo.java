package Concessionaria;

public class Modelo {
    int codigoModelo;
    String nomeModelo;
    Montadora montadora; // montadora será objeto da classe Montadora


    public Modelo()
    {

    }

public Modelo(int codigoModelo, String nomeModelo, Montadora montadora)

{
    this.codigoModelo = codigoModelo;
    this.nomeModelo = nomeModelo;
    this.montadora = montadora;
}

    public int getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(int codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public void exibirDetalhes()
    {
        System.out.println("Codigo modelo: " + getCodigoModelo() + " Modelo: " + getNomeModelo() + " Montadora: " + montadora.getRazaoSocial());
        System.out.println();
    }
}
