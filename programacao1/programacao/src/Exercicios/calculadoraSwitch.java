package Exercicios;
import java.util.Scanner;

public class calculadoraSwitch {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op;
        int i;
        int resultado;
        int conta;
        System.out.println("CALCULADORA");
        System.out.println("");
        System.out.println("DIGITE UMA OPÇÃO : ");
        System.out.println(" 1-SOMAR  2-SUBTRAIR 3-MULTIPLICAR 4-DIVIDIR  : ");
        op = scan.nextInt();
        System.out.println("Informe O número da tabuada ");
        conta = scan.nextInt();

        switch(op){
            case 1:
                System.out.println("Acessou SOMAR :");
               
                for(i = 1; i <= 10; i++){
                    resultado = conta + i;
                    System.out.println(conta + " + " + i + " = " + resultado);
                }
                break;
            case 2:
                System.out.println("Acessou SUBTRAIR :");
                int conta1 = 1;
                conta1 = conta1+conta;
                for(i = 1; i <= 10; i++){
                    
                    resultado = conta1- conta;
                    System.out.println(conta1 + " - " + conta + " = " + resultado);
                    conta1 = conta1 + 1;
                }
                break;    
            case 3:
                System.out.println("Acessou MULTIPLICAR :");
                for(i = 1; i <= 10; i++){
                    resultado = conta * i;
                    System.out.println(conta + " X " + i + " = " + resultado);
                }
                break;
            case 4:
                System.out.println("Acessou DIVIDIR :");
                int conta2 = 0;
                conta2 = conta2+conta;
                for(i = 1; i <= 10; i++){
                    
                    resultado = conta2 / conta;
                    System.out.println(conta2 + " / " + conta + " = " + resultado);
                    conta2 = conta2 + conta;
                }
                break;    
        }

   }
}
