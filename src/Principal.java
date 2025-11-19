import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConverteMoeda converteMoeda = new ConverteMoeda();

        System.out.println("****************************************************************");
        System.out.println("SEJA BEM VINDO AO CONVERSOR DE MOEDAS\n");

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
            System.out.println("*************************************************************\n");

            if (opcao == 1){
                Moedas novaMoeda = converteMoeda.buscaMoedas(opcao);
                System.out.println(novaMoeda);
            } else if (opcao == 2) {
                System.out.println("bom");
            }else {
                System.out.println("Saindo...");
            }

        }
    }
}
