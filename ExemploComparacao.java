import java.util.Scanner;

public class ExemploComparacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a; 
        int b;


        System.out.println("Digite o valor de A ");
        a = scan.nextInt();
        System.out.println("Digite o valor de B ");
        b = scan.nextInt();

        if(a == b){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números sao diferentes");
        }  if(a > b){
            System.out.println("o número " + a + " é maior que " + b);
        }else{
            System.out.println("o número " + a + " é menor que " + b);
        }
    
    }
}
