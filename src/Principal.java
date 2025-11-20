import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConverteMoeda converteMoeda = new ConverteMoeda();

        System.out.println("****************************************************************");
        System.out.println("SEJA BEM VINDO AO CONVERSOR DE MOEDAS\n");


        try {
            Moedas taxas = converteMoeda.buscaMoedas();
            int opcao = 0;

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
                System.out.println("Digite o valor para converter: ");
                double valor = leitura.nextDouble();
                double resultado;
                System.out.println("*************************************************************\n");

                if (opcao == 1) {
                    resultado = converteMoeda.converte(valor, taxas.usd(), taxas.ars());
                    System.out.println("Resultado: " + resultado + "ARS");
                } else if (opcao == 2) {
                    resultado = converteMoeda.converte(valor, taxas.ars(), taxas.usd());
                    System.out.println("Resultado: " + resultado + "USD");
                } else if (opcao == 3){
                    resultado = converteMoeda.converte(valor, taxas.usd(), taxas.brl());
                    System.out.println("Resultado: " + resultado + "BLR");
                } else if (opcao == 4) {
                    resultado = converteMoeda.converte(valor, taxas.brl(), taxas.usd());
                    System.out.println("Resultado: " + resultado + "USD");
                } else if (opcao == 5) {
                    resultado = converteMoeda.converte(valor, taxas.usd(), taxas.cop());
                    System.out.println("Resultado: " + resultado + "COP");
                } else if (opcao == 6) {
                    resultado = converteMoeda.converte(valor, taxas.cop(), taxas.usd());
                    System.out.println("Resultado: " + resultado + "USD");
                } else if (opcao == 7) {
                    System.out.println("Saindo...");
                    break;
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
