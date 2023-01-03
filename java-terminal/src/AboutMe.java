import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: \n");
        String nome2 = scanner.nextLine();

        System.out.println("\nOlá "+nome2+", eu me chamo " + nome + " " + sobrenome
        +"\nTenho " + idade + " anos"
        +"\nMinha altura é " + altura + "cm");
    }
}
