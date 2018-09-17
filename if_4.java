package ro.ControlStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Introduceţi un număr între 1 şi 7 de la tastatură. Afişaţi denumirea zilei corespuzătoare numelui introdus
(1 – Luni, 2 – Marti, etc.)
 */
public class if_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Scrie un numar");
        int nr = sc.nextInt();

        if (nr == 1){
            System.out.println("Luni");
        }

        if (nr == 2){
            System.out.println("Marti");
        }

        if(nr == 3){
            System.out.println("Miercuri");
        }

        if(nr == 4){
            System.out.println("Joi");
        }

        if(nr == 5){
            System.out.println("Vineri");
        }

        if(nr == 6){
            System.out.println("Sambata");
        }

        if (nr == 7){
            System.out.println("Duminica");
        }
    }
}
