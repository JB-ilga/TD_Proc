
import java.util.Scanner;

public class Precedants {

    public static void main(String[] args) {
        
        //Declaration de la variable et appele de scanner
        int prec = 0;
        Scanner lect = new Scanner(System.in);

        //Demande et Initialisation de a
        System.out.println("Entrez un nombre: ");
        int a = lect.nextInt();

        //Demande et Initialisation de b
        System.out.println("Combien des nombres precedants voulez-vous afficher?: ");
        int n = lect.nextInt();

        //Affichage de la phrase en dehors de la boucle
        System.out.print("Les nombres precedants sont: ");

        //BOUCLE ET OPERATION DE NOMBRE PRECEDANTS
        for ( int i = 1; i <= n; i++) {

            prec = a-i;
            
            //Affichage 
            System.out.print(",");
            System.out.print(prec);

        }

    }
    
}
