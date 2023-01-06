import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       Random random = new Random();

        int[][] M = new int[4][4];
        int menor=0,linhaM=0,colunaM=0;

        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
                if(i==0 && j==0)
                    menor = M[i][j];

                if(M[i][j]<menor ){
                    menor = M[i][j];  
                    linhaM=i+1;
                    colunaM=j+1;         
                }
            }
        }        
       
        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
        System.out.println("Menor número da matriz: " + menor + 
        "\nLocalizado em ["+linhaM+"][" + colunaM+"]");    
    }
}
