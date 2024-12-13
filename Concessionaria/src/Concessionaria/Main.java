package Concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;
        int quantidadeMontadoras = 0;
        int quantidadeModelos = 0;
        int quantidadeCarros = 0;
        int quantidadeCodigosMontadora = 0;
        int codigoMontadora;
        int codigoModelo;
        int quantidadeCodigosModelo=0;

        List<Integer> arrayCodigoMontadoras = new ArrayList<>();
        List<Integer> arrayCodigoModelos = new ArrayList<>();

        List<Montadora> arrayMontadora = new ArrayList<>();
        List<Modelo> arrayModelo = new ArrayList<>();
        List<Carro> arrayCarros = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        while(opcao != 7)
        {
            System.out.println("1 - Cadastrar Montadora");
            System.out.println("2 - Cadastrar Modelo");
            System.out.println("3 - Cadastrar Carro");
            System.out.println("4 - Listar Montadoras");
            System.out.println("5 - Listar Modelos");
            System.out.println("6 - Listar Carros");
            System.out.println("7 - Sair");
            System.out.println();
            opcao = teclado.nextInt();
            teclado.nextLine();


            switch (opcao)
            {
                case 1:
                        System.out.println("Informe o código: ");
                        codigoMontadora = teclado.nextInt();
                        teclado.nextLine();
                        if(quantidadeCodigosMontadora > 0) {
                            for (int codigoMontadoras : arrayCodigoMontadoras) {
                                while (codigoMontadoras == codigoMontadora) {
                                        System.out.println("código já cadastrado");
                                        System.out.println("Digite outro código");
                                        codigoMontadora = teclado.nextInt();
                                        teclado.nextLine();
                                }
                            }
                        }

                    System.out.println("Digite a UF(estado): ");
                    String uf = teclado.nextLine();
                    System.out.println("Informe a razão social: ");
                    String razaoSocial = teclado.nextLine();
                    Montadora montadora = new Montadora(codigoMontadora,uf,razaoSocial); // criando o objeto montadora
                    arrayCodigoMontadoras.add(codigoMontadora); // adicionado códigos
                    quantidadeCodigosMontadora = arrayCodigoMontadoras.size();
                    arrayMontadora.add(montadora); // adicionado a montadora na lista de montadoras
                    quantidadeMontadoras = arrayMontadora.size(); // quantiadadeMontadoras recebe o tamanho do array/ lista de montadoras, pra ter um controle

                        break;


                case 2:
                    if(quantidadeMontadoras> 0) {
                        System.out.println("Exibindo Montadoras Disponiveis");
                        for (Montadora montadoras : arrayMontadora) {
                            montadoras.exibirDetalhes();
                        }
                            System.out.println("Informe o código do modelo: ");
                            codigoModelo = teclado.nextInt();
                            arrayCodigoModelos.add(codigoModelo);
                            if(quantidadeCodigosModelo > 0) {
                                for (int codigoModelos : arrayCodigoModelos) {
                                    while (codigoModelos == codigoModelo) {
                                        System.out.println("Codigo ja cadastrado");
                                        System.out.println("Digite outro código");
                                        codigoModelo = teclado.nextInt();
                                    }
                                }
                            }
                        teclado.nextLine();
                        System.out.println("Informe o nome do modelo: ");
                        String nomeDoModelo = teclado.nextLine();
                        System.out.println("Informe o nome da montadora ");
                        String nomeDaMontadora = teclado.nextLine();
                        // buscar a montadora pelo nome

                        Montadora montadoraEncontrada = null;
                        for (Montadora montadoras : arrayMontadora) {
                            // ele realiza uma comparação se razao social do objeto for igual a nomeDaMontadora
                            if (Objects.equals(montadoras.getRazaoSocial(), nomeDaMontadora)) {
                                montadoraEncontrada = montadoras;
                                break;
                            }
                        }

                        if (montadoraEncontrada != null) {
                            Modelo modelo = new Modelo(codigoModelo, nomeDoModelo, montadoraEncontrada);
                            arrayModelo.add(modelo); // adicionando modelos na lista de modelos
                            quantidadeCodigosModelo = arrayModelo.size();
                            quantidadeModelos = arrayModelo.size();

                        } else
                            System.out.println("Montadora não encontrado");
                    }else
                        System.out.println("Cadastre uma montadora primeiro!!");

                    break;

                case 3:
                    if(quantidadeModelos > 0) {
                        System.out.println("Informe a placa: ");
                        String placa = teclado.nextLine();
                        System.out.println("Informe o modelo: ");
                        for (Modelo modelos : arrayModelo) {
                            modelos.exibirDetalhes();
                        }
                        String modeloDoCarro = teclado.nextLine();
                        System.out.println("Informe o ano de fabricação: ");
                        int anoDeFabricacao = teclado.nextInt();

                        Modelo modeloEncontrado = null;

                        for (Modelo modelos : arrayModelo) {
                            if (Objects.equals(modelos.getNomeModelo(), modeloDoCarro)) {
                                modeloEncontrado = modelos;
                                break;
                            }
                        }

                        if (modeloEncontrado != null) {
                            Carro carro = new Carro(placa, modeloEncontrado, anoDeFabricacao);
                            arrayCarros.add(carro); // adicionando o objeto carro na lista/ array de carros
                            quantidadeCarros = arrayCarros.size();


                        } else
                            System.out.println("Modelo não encontrado");
                    }else
                        System.out.println("Cadastre um modelo primeiro!!");

                    break;

                case 4:
                    if(quantidadeMontadoras > 0) {
                        System.out.println("Exibindo Montadoras: ");
                        for (Montadora montadoras : arrayMontadora) {
                            montadoras.exibirDetalhes();
                        }
                    }else
                        System.out.println("Nenhuma montadora foi cadastrada");
                    break;

                case 5:
                    if(quantidadeModelos > 0) {
                        System.out.println("Exibindo os modelos: ");
                        for (Modelo modelos : arrayModelo) // modelos corresponde a um objeto do array , ele vai iterando até o final da lista
                        {
                            modelos.exibirDetalhes();
                        }
                    }else
                        System.out.println("Nenhum modelo foi cadastrado ainda");
                    break;

                case 6:
                    if(quantidadeCarros > 0) {
                        for(Carro carros: arrayCarros)
                        {
                            carros.exibirDetalhes();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saindo do programa");
                    break;




            }
        }
    }
}
