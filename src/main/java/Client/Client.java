package Client;

import Abstractfactory.Android;
import Abstractfactory.IOS;
import Abstractfactory.Smartphone;
import Abstractfactory.Smartphones.Entrada;
import Abstractfactory.Smartphones.Intermediario;
import GeradorSingleton.GeradorId;
import SuporteTecnico.Chamado;
import SuporteTecnico.Registro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
        List<Chamado> histChamados = new ArrayList<>();

        boolean systemOn = true;
        while (systemOn){
            System.out.println("\nMenu Principal");
            System.out.println("(1) Abrir Chamado");
            System.out.println("(2) Listar Chamados");
            System.out.println("(3) Sair");

            String op = input.nextLine();
            switch (op){
                case "1":{
                    System.out.println("\nInforme a Marca do Aparelho");
                    System.out.println("(1) Android \n(2) IOS \n(3) Voltar");
                    Smartphone smartphone;

                    String op2 = input.nextLine();
                    switch (op2){
                        case "1":{
                            System.out.println("\nInforme a Categoria Aparelho");
                            System.out.println("(1) Dispositivo de Entrada\n(2) Dispositivo Intermediário\n(3) Voltar");

                            String op3 = input.nextLine();
                            switch (op3){
                                case "1":{
                                    smartphone = new Android();
                                    Entrada androidM1 = smartphone.criarSmartEntrada();
                                    androidM1.construirSmartEnt();
                                    System.out.println(androidM1.exibirInf());
                                    histChamados.add(abrirChamado(registro(androidM1.getId()), androidM1.exibirInf()));
                                    break;
                                }
                                case "2":{
                                    smartphone = new Android();
                                    Intermediario androidM2 = smartphone.criarSmartIntermediario();
                                    androidM2.construirSmartInt();
                                    System.out.println(androidM2.exibirInf());
                                    histChamados.add(abrirChamado(registro(androidM2.getId()), androidM2.exibirInf()));
                                    break;
                                }
                                default:
                                    System.out.println("Opção invalida.\nTente abrir o chamado novamente...");

                            }
                            break;
                        }
                        case "2":{
                            System.out.println("\nInforme a Categoria Aparelho");
                            System.out.println("(1) Dispositivo de Entrada\n(2) Dispositivo Intermediário\n(3) voltar");

                            String op4 = input.nextLine();
                            switch (op4){
                                case "1":{
                                    smartphone = new IOS();
                                    Entrada IosM1 = smartphone.criarSmartEntrada();
                                    IosM1.construirSmartEnt();
                                    System.out.println(IosM1.exibirInf());
                                    histChamados.add(abrirChamado(registro(IosM1.getId()), IosM1.exibirInf()));
                                    break;
                                }
                                case "2":{
                                    smartphone = new IOS();
                                    Intermediario IosM2 = smartphone.criarSmartIntermediario();
                                    IosM2.construirSmartInt();
                                    System.out.println(IosM2.exibirInf());
                                    histChamados.add(abrirChamado(registro(IosM2.getId()), IosM2.exibirInf()));
                                    break;
                                }
                                default:
                                    System.out.println("Opção invalida.\nTente abrir o chamado novamente...");
                            }
                            break;
                        }
                        default:
                            System.out.println("Opção invalida.\nTente abrir o chamado novamente...");

                    }
                    break;
                }
                case "2":{
                    for (Chamado chamados: histChamados) {
                        System.out.println(chamados);
                    }
                    break;
                }
                case "3":{
                    systemOn = false;
                    break;
                }
                default:
                    System.out.println("Opção invalida");

            }
        }
        input.close();
    }
    public static Registro registro(int idAparelho){
        Scanner input = new Scanner(System.in);

        System.out.print("\nInforme o CPF do proprietário: ");
        String cpf = input.nextLine();
        System.out.print("Descrição do problema: ");
        String descricao = input.nextLine();

        return new Registro(cpf, idAparelho, descricao);
    }
    public static Chamado abrirChamado(Registro registro, String dadosAparelho){
        GeradorId id = GeradorId.getInstance();
        return new Chamado(id.gerarId(), "Aberto", registro, dadosAparelho);
    }
}

