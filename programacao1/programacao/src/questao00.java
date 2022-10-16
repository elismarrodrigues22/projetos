

import java.util.Scanner;

public class questao00 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        float altura;
        char sexo;

        System.out.println("Digite o nome ");
        nome = scan.nextLine();
        System.out.println("Digite a idade");
        idade = scan.nextInt();
        System.out.println("Digite a altura ");
        altura = scan.nextFloat();
        System.out.println("Digite o sexo");
        sexo = scan.next().toCharArray()[0];
        
        System.out.println(" \n Nome : " + nome );
        System.out.println(" \n idade : " + idade );
        System.out.println(" \n altura : " +nome );
        System.out.println(" \n Altura : " + altura );

        //Quantas copas do mundo essa pessoa já viu o Brasil vencer?

        int anoNascimento = 2022 - idade;
        int qtdCopa = 0;
        String listaCopas = "";
        
    }
}
