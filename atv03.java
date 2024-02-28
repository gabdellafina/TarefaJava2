//Desenvolva um código que realiza a transposição de uma matriz (as colunas viram linhas e as linhas viram colunas). Peça aos usuários para inserirem os elementos da matriz, exibindo a matriz transposta no console.
import java.util.Scanner;
public class atv03 {
    public static void main(String[] args) {
        String[][] transposta = new String[3][3];
        Scanner ler = new Scanner(System.in);

        for(int l = 0; l <= 2; l++){
            for(int c = 0; c <= 2; c++){
                System.out.println("Digite um valor: ");
                transposta[l][c] = ler.nextLine();
            }
        }

        for(int l = 0; l <= 2; l++){
            for(int c = 0; c <= 2; c++){
                System.out.println(transposta[c][l]);
            }
        }


        

    }
}
