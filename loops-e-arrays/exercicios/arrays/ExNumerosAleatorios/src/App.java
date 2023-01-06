import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i=0; i<numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.println("Numeros Aleatorios:");
        for (int i : numeros) {
            System.out.print(i+" ");
        }
        System.out.println("\nSucessores:");
        for (int i : numeros) {
            System.out.print((i+1)+" ");
        }
    }
}
