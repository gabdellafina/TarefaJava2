//Multiplicação de Matriz por Escalar:
//Crie um programa que verifique se um login e senha confere com os dados de uma matriz 6x2.
import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        String[][] usuarios = new String[6][2];
        String loginDig, senhaDig;
        boolean loginValido = false, senhaValida = false;
        Scanner ler = new Scanner(System.in);

        for (int l=0; l<=5; l++){
            for (int c=0; c<=1; c++){
                if (c==0){
                    System.out.println("Digite um login: ");
                    usuarios[l][c] = ler.nextLine();
                } else if (c==1){
                    System.out.println("Digite uma senha: ");
                    usuarios[l][c] = ler.nextLine();
                }
            }
        }

        System.out.println("\n");

        System.out.println("Digite o login: ");
        loginDig = ler.nextLine();
        System.out.println("Digite a senha: ");
        senhaDig = ler.nextLine();

        for (int l=0; l<=5; l++){
            if (usuarios[1][0].equals(loginDig)){
                loginValido = true;
                if (usuarios[1][1].equals(senhaDig)){
                    senhaValida = true;
                }
                break;
            }
        }

        if (loginValido && senhaValida){
            System.out.println("Login e senha validos");
        } else {
            System.out.println("Login ou senha invalidos");
            
        }
        
    }
}
