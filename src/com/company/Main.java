package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        int contador6=0;
        int contador7=0;
        int contador8=0;
        int contador9=0;
        int contador10=0;
        int contador11=0;
        int contador12=0;


        int n = 0;

        int resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige las veces que quieres tirar el dado: ");
        n=scanner.nextInt();


        for (int i = 0; i < n ; i++) {

            resultado = (int) (Math.random() * 11) + 2;


            if(resultado==1){contador1++;}
            if(resultado==2){contador2++;}
            if(resultado==3){contador3++;}
            if(resultado==4){contador4++;}
            if(resultado==5){contador5++;}
            if(resultado==6){contador6++;}
            if(resultado==7){contador7++;}
            if(resultado==8){contador8++;}
            if(resultado==9){contador9++;}
            if(resultado==10){contador10++;}
            if(resultado==11){contador11++;}
            if(resultado==12){contador12++;}


        }


        System.out.println("El 1 ha salido " + contador1 + " veces");
        System.out.println("El 2 ha salido " + contador2 + " veces");
        System.out.println("El 3 ha salido " + contador3 + " veces");
        System.out.println("El 4 ha salido " + contador4 + " veces");
        System.out.println("El 5 ha salido " + contador5 + " veces");
        System.out.println("El 6 ha salido " + contador6 + " veces");
        System.out.println("El 7 ha salido " + contador7 + " veces");
        System.out.println("El 8 ha salido " + contador8 + " veces");
        System.out.println("El 9 ha salido " + contador9 + " veces");
        System.out.println("El 10 ha salido " + contador10 + " veces");
        System.out.println("El 11 ha salido " + contador11 + " veces");
        System.out.println("El 12 ha salido " + contador12 + " veces");


    }
}
