import java.util.Scanner;

public class Matrice {

    public static void main(String[] args) {

        // Déclaration de la matrice
        int a[][] = new int[4][5];
        int n;
        boolean trouve = false; // Variable pour suivre si le nombre est trouvé

        // Entrée de la matrice
        Scanner lire = new Scanner(System.in);
        System.out.println("--- SOMME DES MATRICES ---");
        System.out.println("Entrer la matrice de dimension 4x5");

        // Saisie des valeurs dans la matrice
        System.out.println("SAISIR LA MATRICE A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Entrer la valeur pour la ligne " + (i + 1) + " et la colonne " + (j + 1));
                a[i][j] = lire.nextInt();
            }
        }

        // Vérification de l'existence d'un nombre
        System.out.println("Entrer un nombre à vérifier dans la matrice : ");
        n = lire.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == n) {
                    trouve = true; // Le nombre a été trouvé
                    break; // Sortir de la boucle interne
                }
            }
            if (trouve) break; // Sortir de la boucle externe si trouvé
        }

        // Résultat de la recherche
        if (trouve) {
            System.out.println("Le nombre " + n + " se trouve dans la matrice.");
        } else {
            System.out.println("Le nombre " + n + " ne se trouve pas dans la matrice.");
        }

        // Affichage de la matrice
        System.out.println("LA MATRICE A : ");
        for (int i = 0; i < 4; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("]");
        }

       
    }
}
