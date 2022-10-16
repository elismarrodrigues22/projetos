package atividade01;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,antecessor,sucessor;

        System.out.println(" Informe um número ");
        num = scan.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println(" O número digitado foi : " + num);
        System.out.println(" O número antecessor é : " + antecessor);
        System.out.println(" O número sucessor é : " + sucessor);
    }
}
