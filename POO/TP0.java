
import java.util.Scanner;
public class TP0 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largeur;
        double longeur;
        double air ;
        double perimetre ;
        double vd;
        System.out.print("Entrez la longueur du rectangle: ");
        double longueur = scanner.nextDouble();
        System.out.print("Entrez la largeur du rectangle: ");
         largeur = scanner.nextDouble();
        air = longueur * largeur;
        perimetre = 2 * (longueur + largeur);
        System.out.println("L'aire du rectangle est: " + air);
        System.out.println("Le périmètre du rectangle est: " + perimetre); 
        vd = Math.sqrt(longueur * longueur + largeur * largeur);
        System.out.println("La diagonale du rectangle est: " + vd);
    }
    
}
