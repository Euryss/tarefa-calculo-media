package com.media;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double nota4 = 0.0;
        double media = 0.0;

        System.out.println("Insira o valor da primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Insira o valor da segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Insira o valor da terceira nota: ");
        nota3 = input.nextDouble();
        System.out.println("Insira o valor da quara nota: ");
        nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(" A media dás notas é=  "+media);
    }


}
