package Exercices;
import java.util.Scanner;

public class exo162{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double multiplicateur = 1.0;

        System.out.printf("\n Qu'elle est le prix du vol :");
        double prix=sc.nextDouble();
    
        System.out.printf("\n Qu'elle est l'âge du passager:");
        int age=sc.nextInt();
        System.out.printf("\n Combien de place reste il ?: ");
        int place=sc.nextInt();
        System.out.printf("\n Le passager veut-il une classe business (oui/non) ? :");
        sc.nextLine(); // Nettoyage du buffer d'entrée
        String business = sc.nextLine();


        
        if (age < 18){
            //Réduction de 20%
            multiplicateur *= 0.80;
        } else if (age > 60){
            //Réduction de 40%
            multiplicateur *= 0.60;
        } else if  (place <20){
            // Augmentation de 20%
            multiplicateur=0*1.2;
        } else if (place > 60) {
            //Réduction de 20%
            multiplicateur=0*8;
        } else if ( business.equalsIgnoreCase("Oui")){
            //Augmentation de 20%
            multiplicateur=0*1.2;
        }
        double finalPrix = prix * multiplicateur;
        System.out.printf("Le prix du vol est de %.2f euros", finalPrix);


        sc.close();
    }
}

/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/


