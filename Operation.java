import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        Scanner lect = new Scanner(System.in);

        //Demande et lecture a et b
        System.out.println("Entrez la premiere valeur: a");
        float a = lect.nextFloat();
        System.out.println("Entrez la seconde valeur: b");
        float b = lect.nextFloat();

        //Choix numerique des operations
        System.out.println("Choisissez une operation: [1.addition +, 2.soustraction -, 3.multiplication *, 4.division /]");
        int c = lect.nextInt();

        //Gestion rapide des conditions
        switch (c) {
            case 1: {
                float somme = a+b;
                float doub = somme * 2;
                System.out.println("La somme est: "+somme+" et son double est: "+doub);
            }
            break;

            case 2: {
                float diff = a-b;
                float doub = diff * 2;
                System.out.println("La difference est: "+diff+" et son double est: "+doub);
            }
            break;

            case 3: {
                float prod = a*b;
                float doub = prod * 2;
                System.out.println("Le produit est: "+prod+" et son double est: "+doub);
            }
            break;

            case 4: {
                float quot = a/b;
                float doub = quot * 2;
                System.out.println("Le quotient est: "+quot+" et son double est: "+doub);
            }
            break;

            default:
                System.out.println("Entrez une valeur numerique du menu!");
        }

    }
    
}