package Exercices;
import java.util.Scanner;

public class exo151{
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
        String deviseEntree;
        String deviseSortie;
        double amount;

        // Taux de conversion (exemple, à actualiser selon le cours réel)
        final double EUR_TO_USD = 1.14;     // 1 EUR = 1.08 USD
        final double EUR_TO_GBP = 0.85;     // 1 EUR = 0.85 GBP

        final double USD_TO_EUR = 0.87;     // 1 USD = 0.87 EUR
        final double USD_TO_GBP = 0.75;     // 1 USD = 0.75 GBP

        final double GBP_TO_EUR = 1.16;     // 1 GBP = 1.16 EUR
        final double GBP_TO_USD = 1.33;     // 1 GBP = 1.27 USD
        
        // DEVISE ENTRANTE
        System.out.println("Quel est votre monnaie ? (EUR, USD, GBP)");
        deviseEntree= scanner.nextLine().trim().toUpperCase();

        // DEVISE SORTANTE
        System.out.println("Quel est votre monnaie ? (EUR, USD, GBP)");
        deviseSortie= scanner.nextLine().trim().toUpperCase();
        
        //ERREUR, DEVISE IDENTITIQUE
        if (deviseEntree.equalsIgnoreCase(deviseSortie)){
            System.err.println("Impossible de convertir la même devise ! ");
            return;
        } 
        //CHOISIR UN MONTANT
        else {
            System.out.println("Choisir un montant à convertir : ");
            amount=scanner.nextDouble();
        }

        double convertedAmount = 0.0;

        if (deviseEntree.equalsIgnoreCase("EUR")){
            if (deviseEntree.equalsIgnoreCase("USD")){
                convertedAmount = amount * EUR_TO_USD;
            } else if  (deviseEntree.equals("GBP")) {
                convertedAmount = amount * EUR_TO_GBP;
        }
          
        }
      
        scanner.close();

    }
}


/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/





