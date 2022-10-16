package Exercicios;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner (System.in);
         int a;
         int b;
         int resultado;
        System.out.println("Exemplo IO ");
        System.out.println("Digite o primeiro Numero");
        a = obj.nextInt();
        System.out.println("Digite o segundo número"); 
        b = obj.nextInt();
        resultado = a+b;
        System.out.println("A soma do número " + a + " +" + b + " = " + resultado);

       

     obj.close();   
    }
}
