
import java.util.Scanner;

public class Exercicio03 { 
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
       
        int nota1,nota2,nota3,media; 
       
        
            System.out.println("Informe a primeira nota:");
            nota1 = input.nextInt();
            System.out.println("informe a segunda nota:");
             nota2 = input.nextInt();
            System.out.println("informe a terceira nota:");
            nota3 = input.nextInt();
           
            media = nota1 + nota2 + nota3;
        System.out.println("A média das notas é:" + media);
       
       
        
        input.close();
        }
      
    }



      

