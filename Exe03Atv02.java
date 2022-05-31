import java.time.LocalDate;
import java.util.Scanner;

public class Exe03Atv02 {    
    public static void main(String args[]) {
        int anoNascimento;
        Scanner input = new Scanner(System.in);
        LocalDate anoCorrente = LocalDate.now(); 
        
        System.out.println("Informe o ano de nascimento");
        anoNascimento = input.nextInt();
       
        System.out.println("Idade: " + (anoCorrente.getYear() - anoNascimento));
        System.out.println("Idade em 2050: " + (2050 - anoNascimento));

        input.close();
    }
}
