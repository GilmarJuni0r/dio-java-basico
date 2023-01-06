import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] letras = new String[6];
        String aux=" ";
        int qtd=0;
        
        for(int i=0; i<letras.length; i++){
            System.out.println("Digite uma letra:");
            aux=scanner.next();

            if(!(aux.equalsIgnoreCase("a") ||
            aux.equalsIgnoreCase("e") ||
            aux.equalsIgnoreCase("i") ||
            aux.equalsIgnoreCase("o") ||
            aux.equalsIgnoreCase("u"))){
                letras[i] = aux;
                qtd++;
            }
        }
        if(qtd>0){
            System.out.println("Quantidade de consoantes digitadas: "+qtd+
            "\nAs seguintes consoantes foram digitadas:");    
        }

        for(int i=0; i<letras.length; i++){
            if(letras[i] != null)
                System.out.print(letras[i]+" ");
        }

    }
}
