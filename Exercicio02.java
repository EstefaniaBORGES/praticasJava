

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        int x,y,z, resultado;

        System.out.println("informe o primeiro nnúmero");
        x = input.nextInt();
        System.out.println("informe o segundo nnúmero");
        y = input.nextInt();
        System.out.println("informe o terceiro nnúmero");
        z = input.nextInt();
        resultado = x + y - z;
        
        System.out.println("Oresultado é : " + resultado );
        
        input.close();
    }
}