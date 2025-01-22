import java.util.Scanner;

public class ProduitMat {

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.println("---LE PRODUIT DE MATRICES AVEC LA TRANSPOSEE DE B-----");
        
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int c[][] = new int[4][4]; // Matrice pour stocker le produit

        // Saisie de la matrice A
        System.out.println("ENTRER LA MATRICE A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Entrer la ligne " + (i + 1) + " et la colonne " + (j + 1));
                a[i][j] = lire.nextInt();
            }
        }

        // Saisie de la matrice B
        System.out.println("ENTRER LA MATRICE B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Entrer la ligne " + (i + 1) + " et la colonne " + (j + 1));
                b[i][j] = lire.nextInt();
            }
        }

        // Calcul de la transposée de B
        int bTransposee[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                bTransposee[j][i] = b[i][j]; // Échange des lignes et colonnes
            }
        }

        // Calcul du produit de A avec la transposée de B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = 0; // Initialisation de l'élément
                for (int k = 0; k < 4; k++) {
                    c[i][j] += a[i][k] * bTransposee[k][j];
                }
            }
        }

        // Affichage de la matrice A
        System.out.println("MATRICE A :");
        afficherMatrice(a);

        // Affichage de la matrice B
        System.out.println("MATRICE B :");
        afficherMatrice(b);

        // Affichage de la transposée de B
        System.out.println("TRANSPOSEE DE B :");
        afficherMatrice(bTransposee);

        // Affichage du produit
        System.out.println("LE PRODUIT DE A AVEC LA TRANSPOSEE DE B :");
        afficherMatrice(c);

        lire.close(); // Fermer le Scanner
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
