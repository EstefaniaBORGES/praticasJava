import java.util.Scanner;

public class Exe03Atv03 {
    public static void main(String[] args) {
        double cotacaoDolar, valorDolar, valorReal;
        Scanner input = new Scanner(System.in);
        System.out.println("Conversor de Dolar em real");
          
        System.out.println("Digite a cotação do dolar:");

        cotacaoDolar = input.nextDouble();
        System.out.println("Digite o valor em reais:");
        valorReal = input.nextDouble();
        valorDolar = cotacaoDolar * valorReal;

        System.out.println("O valor de reais em dolar é:" + valorDolar);

        input.close();
    }

}
