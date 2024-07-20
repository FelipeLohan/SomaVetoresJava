import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos numeros terá cada vetor? ");
        int n;
         n = teclado.nextInt();
            int[] numA = new int[n];
            int[] numB = new int[n];
            int[] numC = new int[n];

        for(int i = 0; i < numA.length; i++){
            System.out.println("Digite o numero Vetor A: ");
                numA[i] = teclado.nextInt();
        }   

        for(int i = 0; i < numB.length; i++){
            System.out.println("Digite o numero Vetor B: ");
                numB[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < numC.length; i++){
            numC[i] = numA[i] + numB[i];
            System.out.println("Soma da posicao "+ i +" resulta em: " + numC[i]);
        }
    }
}
