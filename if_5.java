package ro.ControlStatements;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/*
Se cunoaşte gravitaţia relativă pentru fiecare planetă. Să se introducă greutatea de pe Pământ şi planeta dorită şi
să se afle greutatea pe planeta respectivă, ştiind că:
• 1 Venus – 0.78
• 2 Marte – 0.39
• 3 Jupiter – 2.65
• 4 Saturn – 1.17
• 5 Uranus – 1.05
• 6 Neptun – 1.23
Pentru calcul, se va înmulţi greutatea introdusă cu gravitaţia de pe planeta cerută.
Ex: 128 * 0.39 = 49.92.
 */
public class if_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Greutate de pe Pamant:");
        int greutate = sc.nextInt();

        System.out.println("Planeta dorita:");
        int planeta = sc.nextInt();



        double rez = sc.nextDouble();

        double Venus = 0.78;
        double Marte = 0.39;
        double Jupiter = 2.65;
        double Saturn = 1.17;
        double Uranus = 1.05;
        double Neptun = 1.23;

        if (planeta == 1){
            rez = Venus * greutate;
        }

        if (2 == Marte){
            rez = Marte * greutate;
        }

        if (3 == Jupiter){
            rez = Jupiter * greutate;
        }

        if (4 == Saturn){
            rez = Saturn * greutate;
        }

        if (5 == Uranus){
            rez = Uranus * greutate;
        }

        if (6 == Neptun){
            rez = Neptun * greutate;
        }




    }
}
