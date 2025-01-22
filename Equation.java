import java.util.Scanner;

public class Equation {

    //PROCEDURE POUR CALCULER LA RACINE ET AFFICHAGE DE RESULTAT
    public static void Affichage(double b,double a,double c,double delta,double x1, double x2,double z1,double cst){

       delta =(b*b)-4*a*c;
       double v;

       v = Math.sqrt(delta); 
       if (delta>0){
       x1 = (-b+v)/(2*a);
       x2 = (-b-v)/(2*a);

       System.out.println("les racines sont x1 = "+x1+" et x2= "+x2);

       }
       else if (delta < 0){

        delta = - delta;
        v = Math.sqrt(delta);
        z1=-b/2*a;
        cst =v/2*a;
       System.out.println("la racine est z1 = "+z1+ " +i" +cst);

       System.out.println("la racine est z2 = "+z1+ " +i" +cst);


    
    }else{

        double x = -b/2*a;
        System.out.println("les racines sont x1 = x2= "+x);

    }
       

    }

    // LE MAIN POUR ENTRER LES COEFFICIENTS
    
    public static void main(String[] args) {

        double a, b, c;
        Scanner lect = new Scanner(System.in);

        System.out.println("L'equation est de la forme:[ax^2 + bx + c = 0]");
        System.out.println("Tapez a: ");
        a = lect.nextDouble();
        System.out.println("Tapez b: ");
        b = lect.nextDouble();
        System.out.println("Tapez c: ");
        c = lect.nextDouble();
        
        System.out.println("L'equation saisie est: "+a+" x^2 + "+b+" x + "+c+" = 0.");

        Affichage(b, a, c, a, c, c, c, c);
        



    }

}
