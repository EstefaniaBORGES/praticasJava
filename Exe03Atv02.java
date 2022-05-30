import java.util.Scanner;

public class Exe03Atv02 {    
 
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);
    int nascimento,atual,resultado;
    int alvo = 2050;
    
    System.out.println("Informe o ano de nascimento");
            nascimento = input.nextInt();
            System.out.println("informe o ano atual");
             atual = input.nextInt();
             resultado = nascimento - atual;
            System.out.println("Sua idade em 2050 será :" + resultado + alvo);        
            
            input.close();
    }
}
