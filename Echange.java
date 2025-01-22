
import java.util.Scanner;

public class Echange {
    public static void main(String[] args) {

        Scanner lect = new Scanner(System.in);

        int prod,a,b,somme;

        System.out.println("Entrer la premiere valeur : a");
        a = lect.nextInt();

        System.out.println("Entrer la deuxieme valeur : b");
        b = lect.nextInt();

        somme = a+b;
        prod  = a*b;

        System.out.println("Les valeurs entrées sont a = "+a+" et b = "+b);

        if ( prod<0 ) {

             //Les operations d'echanges 
             a = a + b;
             b = a - b;
             a = a - b;
             
             //L'affichage des valeurs
             System.out.println("les nouvelles valeurs de a et b sont: a = "+a+" et b = "+b);   
        }
        
        else{
            System.out.println("Le Produit est "+prod);
            System.out.println("La somme est "+somme);
            
            // Affectation du produit dans a
            int c = prod;
            prod = a;
            a = c;

            //Affectation de la somme dans b
            somme = somme + b;
            b     = somme - b;
            somme = somme - b;

            //Affichage des nouvelles valeurs
            System.out.println("Les nouvelles valeurs sont: a = "+a +" et b = "+b);

        }
    
    }
    
}