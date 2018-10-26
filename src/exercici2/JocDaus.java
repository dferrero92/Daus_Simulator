package exercici2;

import java.util.Scanner;

public class JocDaus {

    int resultat1;
    int resultat2;
    int resultat3;

    int victorias=0;
    int intentos=0;

    public void constructor(){

        Dau d1 = new Dau();
        Dau d2 = new Dau();
        Dau d3 = new Dau();

        resultat1= (int) (Math.random() * 6) + 1; // d1.resultado=.....
        resultat2= (int) (Math.random() * 6) + 1;
        resultat3= (int) (Math.random() * 6) + 1;

        if(resultat1==resultat2 && resultat2==resultat3 && resultat1==resultat3){


            resultat1=d1.resultado;
            resultat2=d2.resultado;
            resultat3=d3.resultado;

            victorias++;
        }


        System.out.println("-------");
        System.out.println(resultat1);
        System.out.println(resultat2);
        System.out.println(resultat3);
        System.out.println("Victorias: " + victorias);

    }


    public void jugarPartida(){

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Indica lo que deseas hacer: 1) Jugar Partida  |   2) Salir ");
        int opcion=1;

        while(opcion !=2 ){
        System.out.println("Indica lo que deseas hacer: 1) Jugar Partida  |   2) Salir ");
        opcion = scanner.nextInt();scanner.nextLine();

        switch (opcion){

            case 1 : constructor(); intentos++;
                System.out.println("Lo has intentado " + intentos + " veces");
            break;

            case 2:
                System.out.println("Intentos: " + intentos);
                System.out.println("Victorias: " + victorias); break;
        }

        }


    }

}
