
import java.util.Scanner;

public class SommeN {
    public static void main(String[] args) {

        Scanner lect = new Scanner(System.in);
        int somme=0;

        //Demande et lecture de n 
        System.out.println("Saisissez un nombre positif: ");
        int n = lect.nextInt();

        //Boucle for pour la somme des nombres
        System.out.println("La progression de n");
        for (int i = 0; i < n; i++) {

            if( somme < n ){

                System.out.print(", "+i);
                somme=somme+i;

            }
            
        }

        //Affichage somme et gestion de la ligne
        System.out.println();
        System.out.println("La somme est "+somme);
    }
}
