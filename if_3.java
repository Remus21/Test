package ro.ControlStatements;

/*
Creaţi un program care să afişeze unul din următoarele mesaje pentru o vârstă introdusă de la tastatură.
        Testaţi programul cu toate variantele.
        • Pentru o vârstă mai mică de 16 ani, “Nu poţi conduce.”
        • Pentru o vârstă între 16 şi 17 ani: “Poţi conduce, dar nu poţi vota.”
        • Pentru o vârstă între 18 şi 24 de ani: “Poţi vota, dar nu poţi închiria maşini.”
        • Pentru o vârstă de 25 de ani sau mai mare: “Poţi să faci cam orice.”
*/

import java.util.Scanner;

public class if_3 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ce varsta ai?");
            int varsta = sc.nextInt();

            if(varsta < 16){
                System.out.println("Nu poti conduce!");
            }

            if (varsta >= 16 && varsta <= 17){
                System.out.println("Poti conduce, dar nu poti vota");
            }

            if (varsta >= 18 && varsta <= 24){
                System.out.println("Poti vota, dar nu poti inchiria masini");
            }

            if (varsta >= 25){
                System.out.println("Poti face cam orice");
            }
        }



}
