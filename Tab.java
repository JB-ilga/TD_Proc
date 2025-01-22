import java.util.Scanner;

public class Tab{
    public static void main(String[] args) {

        Scanner lect = new Scanner(System.in);

        //DECLARATION DES VARIABLES
        int tab[] = new int[10];
        int somme = 0;
        int prod = 1 ;
        double moyenne ;

        //  BOUCLE POUR INITIALISATION ET OPERATION
        for (int i = 0; i < 10; i++) {
            
        System.out.println("Entrer l'element "+(i+1));
        tab[i] = lect.nextInt();

        somme += tab[i];
        prod *=  tab[i];

    }
        //Calcul de la moyenne sans boucle 
        moyenne = somme/10.0 ;
       

        System.out.println("Votre tableau est ");

        //Affichage avec crochet
        System.out.print( "[");

        //Boucle pour affichage
        for (int i = 0; i < 10; i++) {

            System.out.print(" , "+tab[i]);
   
        }
        System.out.print("]");

        //AFFICHAGE DES ELEMENTS 
        System.out.println( );
        System.out.println("La somme des elements entres est "+somme+" et le produit est "+prod);
        System.out.println("La moyenne est "+moyenne);
        
        
    }
}