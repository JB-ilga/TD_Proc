import java.util.Scanner;

public class Temps{
    public static void main(String[] args) {

        // Variable Declaration et appel de Scanner pour la lecture

        int t,heure,min,sec;
        Scanner lect = new Scanner(System.in);

        // Demande et affichage du temps en seconde
        System.out.println("Entrer le temps en seconde");
        t = lect.nextInt();

        //Operation de conversion
        heure = (t/3600);
        min = (t%3600)/60;
        sec =  (t%3600)%60;

        // Affichage de la conversion
        System.out.println("Votre heure est "+heure+" heures et "+min+" minutes"+" et "+sec+" secondes");

        
    }
}