package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rectangleSides = new Scanner(System.in);

        System.out.print("Quanti cm misura la base? ");
        int base = Integer.parseInt(rectangleSides.nextLine());
        System.out.print("Quanti cm misura l'altezza? ");
        int height = Integer.parseInt(rectangleSides.nextLine());

        Rettangolo myRectangle = new Rettangolo(base, height);
        System.out.println("Il perimetro è: " + myRectangle.perimetro());
        System.out.println("L'area è: " + myRectangle.area());
    }

        //STAMPO I DATI E CALCOLI DEL RETTANGOLO




   /* public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3, 5);
        String rettangoloString = rettangolo.toString();

        System.out.println(rettangolo);
    */


        }


