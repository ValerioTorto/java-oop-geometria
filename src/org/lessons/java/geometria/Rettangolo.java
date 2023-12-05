package org.lessons.java.geometria;

public class Rettangolo {
    //ATTRIBUTI
    int base;
    int height;

    //COSTRUTTORE CON PARAMETRI

    Rettangolo(int base, int height) {
        this.base = base;
        this.height = height;
    }

    //METODO
    int perimetro() {
        return 2 * (base + height);
    }
    int area() {
        return base * height;
    }
    //STAMPO I DATI E CALCOLI DEL RETTANGOLO
    @Override
    public String toString() {
        return "Rettangolo {" +
                "base= " + base  +
                ", height= " + height +
                ", perimeter= " + perimetro() +
                ", area= " + area() +
                '}';
    }
}
