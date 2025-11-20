import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConverteMoeda converteMoeda = new ConverteMoeda();

        System.out.println("****************************************************************");
        System.out.println("SEJA BEM VINDO AO CONVERSOR DE MOEDAS\n");

        int opcao = 0;
        try {
            while (opcao != 7) {
                System.out.println("1- Dolar =>> Peso Argentino");
                System.out.println("2- Peso Argentino =>> Dolar");
                System.out.println("3- Dolar =>> Real Brasileiro");
                System.out.println("4- Real Brasileiro =>> Dolar");
                System.out.println("5- Dolar =>> Peso Colombiano");
                System.out.println("6- Peso Colombiano =>> Dolar");
                System.out.println("7- Sair");
                System.out.println("Escolha uma opção válida: ");
                opcao = leitura.nextInt();
                System.out.println("*************************************************************\n");

                if (opcao == 1) {
                    Moedas novaMoeda = converteMoeda.buscaMoedas("USD", "ARS");
                    System.out.println("1 " + novaMoeda.origem() + " = " + novaMoeda.taxa() + " " + novaMoeda.destino());
                } else if (opcao == 2) {
                    Moedas novaMoeda = converteMoeda.buscaMoedas("ARS", "USD");
                    System.out.println("1" + novaMoeda.origem() + " = " + novaMoeda.taxa() + " " + novaMoeda.destino());
                } else if (opcao == 3){
                    Moedas novaMoeda = converteMoeda.buscaMoedas("USD", "BRL");
                    System.out.println("1" + novaMoeda.origem() + " = " + novaMoeda.taxa() + " " + novaMoeda.destino());
                } else if (opcao == 4) {
                    Moedas novaMoeda = converteMoeda.buscaMoedas("BRL", "USD");
                    System.out.println("1" + novaMoeda.origem() + " = " + novaMoeda.taxa() + " " + novaMoeda.destino());
                } else if (opcao == 5) {
                    Moedas novaMoeda = converteMoeda.buscaMoedas("USD", "COP");
                    System.out.println("1" + novaMoeda.origem() + " = " + novaMoeda.taxa() + " " + novaMoeda.destino());
                } else if (opcao == 6) {
                    Moedas novaMoeda = converteMoeda.buscaMoedas("COP", "USD");
                    System.out.println("1" + novaMoeda.origem() + " = " + novaMoeda.taxa() + " " + novaMoeda.destino());
                } else if (opcao == 7) {
                    System.out.println("Saindo...");
                } else {
                    System.out.println("Opção inválida!");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }
    }
}
