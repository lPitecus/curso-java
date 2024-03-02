import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void exibirInformacoes(Conta conta) {
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Crédito: " + conta.getCredito());
        System.out.println("Bônus: " + conta.getBonus());
        System.out.println("Moeda: " + conta.getMoeda());
        System.out.println("Tipo de Conta: " + conta.tipoDeConta);
    }
        
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaA contaA = new ContaA("NomeContaA", 1000, 0, 'y');
        ContaB contaB = new ContaB("NomeContaB", 2000, 0, 'x');

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir informações de uma conta");
            System.out.println("2 - Receber crédito em uma conta");
            System.out.println("3 - Aumentar bônus em uma conta");
            System.out.println("4 - Converter saldo para dólar na ContaA");
            System.out.println("5 - Atualizar tipo de alguma conta");
            System.out.println("6 - Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("De qual conta você deseja exibir as informações?");
                    System.out.println("1 - Conta A");
                    System.out.println("2 - Conta B");
                    System.out.println("3 - Ambas");
                    int opcaoExibir = scanner.nextInt();
                    if (opcaoExibir == 1 || opcaoExibir == 3) {
                        System.out.println("Informações da Conta A:");
                        exibirInformacoes(contaA);
                        if (opcaoExibir == 3) {
                            System.out.println();
                        }
                    }
                    if (opcaoExibir == 2 || opcaoExibir == 3) {
                        System.out.println("Informações da Conta B:");
                        exibirInformacoes(contaB);
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do crédito: ");
                    double credito = scanner.nextDouble();
                    System.out.println("Em qual conta você deseja receber o crédito?");
                    System.out.println("1 - Conta A");
                    System.out.println("2 - Conta B");
                    System.out.println("3 - Ambas");
                    int opcaoCredito = scanner.nextInt();
                    if (opcaoCredito == 1 || opcaoCredito == 3) {
                        contaA.receberCredito(credito);
                    }
                    if (opcaoCredito == 2 || opcaoCredito == 3) {
                        contaB.receberCredito(credito);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor do aumento: ");
                    double aumento = scanner.nextDouble();
                    System.out.println("Em qual conta você deseja aumentar o bônus?");
                    System.out.println("1 - Conta A");
                    System.out.println("2 - Conta B");
                    System.out.println("3 - Ambas");
                    int opcaoBonus = scanner.nextInt();
                    if (opcaoBonus == 1 || opcaoBonus == 3) {
                        contaA.aumentarBonus(aumento);
                    }
                    if (opcaoBonus == 2 || opcaoBonus == 3) {
                        contaB.aumentarBonus(aumento);
                    }
                    break;
                case 4:
                    System.out.println("Digite o valor do câmbio: ");
                    double cambio = scanner.nextDouble();
                    contaA.converterParaDolar(cambio);
                    break;
                case 5:
                    System.out.println("Em qual conta você deseja atualizar o tipo?");
                    System.out.println("1 - Conta A");
                    System.out.println("2 - Conta B");
                    System.out.println("3 - Ambas");
                    int opcaoAtualizar = scanner.nextInt();
                    System.out.println("Para qual tipo você deseja atualizar?");
                    System.out.println("1 - Tipo X");
                    System.out.println("2 - Tipo Y");
                    int opcaoTipo = scanner.nextInt();
                    if (opcaoAtualizar == 1 || opcaoAtualizar == 3) {
                        if (opcaoTipo == 1) {
                            contaA.atualizarParaX();
                        } else if (opcaoTipo == 2) {
                            contaA.atualizarParaY();
                        }
                    }
                    if (opcaoAtualizar == 2 || opcaoAtualizar == 3) {
                        if (opcaoTipo == 1) {
                            contaB.atualizarParaX();
                        } else if (opcaoTipo == 2) {
                            contaB.atualizarParaY();
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
