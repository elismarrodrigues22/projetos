package Exercicios;
import java.util.Scanner;

public class atividadeComparacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        
       System.out.println("Digite um  número"); 
        x = scan.nextInt();
        System.out.println("Digite outro  número"); 
        y = scan.nextInt();

        if(x > y){
            System.out.println("O número " + x + " é maior que " + y);
        }
            else if(x < y){
                System.out.println("O número " + x + " é menor que " + y);
            }
            
        

        if(x != y){
            System.out.println("Os números são diferentes ");
        }
            else{
                System.out.println("Os números são iguais");
            }

            System.out.println("CALCULADORA ");

            
            
        
       scan.close();
    }
}
