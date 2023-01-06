public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
        int aux = numeros.length-1;

        for(int i=0; i<numeros.length; i++){
            if(i != (numeros.length-1))
                System.out.print(numeros[i]+",");
            else
                System.out.print(numeros[aux]+"\n");         
        }

        for(int i=0; i<numeros.length; i++){
            if(i != (numeros.length-1))
                System.out.print(numeros[aux]+",");
            else
                System.out.print(numeros[aux]);
            aux--;
        }
    }
}
