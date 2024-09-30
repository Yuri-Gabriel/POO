import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int acertos = 0;
        int player = 0;
        int[] numeros = new int[3];
        for(int i = 0; i < numeros.length; i++) {
            int num = 1 + random.nextInt(10);
            if(!numeroJaExiste(num, numeros)) {
                numeros[i] =  num;
            }
        }
        
        System.out.println("Olá, eu pensei em 3 numero que estão entre 1 e 10, tente adivinhar");
        do {
            System.out.print("Digite um numero entre 1 e 10: ");
            player = scan.nextInt();
            while(player < 0 || player > 10) {
                System.out.print("\nApenas numeros entre 1 e 10: ");
                player = scan.nextInt();
            }
            for(int num : numeros) {
                if(num == player) {
                    acertos++;
                }
            }
            System.out.println("Total de acertos: " + acertos);
        } while(acertos < 3);

        System.out.println("Parabens, você acertou todos os numeros");
        System.out.println("Eles eram: ");
        for(int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static boolean numeroJaExiste(int n, int[] nums) {
        for(int j = 0; j < nums.length; j++) {
            if(n == nums[j]) {
                return true;
            }
        }
        return false;
    }
}
