/*Avec Print & Scanner : Me faire un code qui convertit un prix HT (Hors Taxe) en prix TTC 
(Toute taxe comprise) à l’aide de la TVA (en pourcentage) que vous pourrez changer à 
votre guise*/
package Pratices;
import java.util.Scanner;

public class casPratique3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("\nIndiquer le montant HT en euros : ");
        Double prixHT = clavier.nextDouble();
        System.out.println("\nChoisir un taux de TVA: ");
        Double TVA = clavier.nextDouble();

        double prixTTC = prixHT * (1 +TVA/100);

        System.out.println("\nLe prix HT (Hors Taxe), une fois la taxe ajoutée équivaut à : "+prixTTC+ " EUR.");

        clavier.close();
    }
}
