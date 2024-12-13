package Concessionaria;

public class Montadora {


    int codigoMontadora;
    String uF;
    String razaoSocial;

    public Montadora()
    {

    }

    public Montadora(int codigoMontadora,String uF, String razaoSocial)
    {
        this.codigoMontadora = codigoMontadora;
        this.uF = uF;
        this.razaoSocial = razaoSocial;
    }

    public int getCodigoMontadora()
    {
        return  codigoMontadora;
    }

    public void setCodigoMontadora(int codigoMontadora)
    {
        this.codigoMontadora = codigoMontadora;
    }

    public String getuF()
    {
        return uF;
    }

    public void setuF(String uF)
    {
        this.uF = uF;
    }

    public String getRazaoSocial()
    {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial)
    {
        this.razaoSocial = razaoSocial;
    }

    public void exibirDetalhes()
    {
        System.out.println("Código da montadora: " + getCodigoMontadora() + " UF: " + getuF() + " Razão Social: " + getRazaoSocial());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Razão Social: " + razaoSocial;
    }
}
