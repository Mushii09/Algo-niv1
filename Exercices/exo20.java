package Exercices;
import java.util.Scanner;

public class exo20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int votants= 150000;

        System.out.println("\nSondage pour des élections : ");

        System.out.println("\nNombre de voix pour Josephine Inutile : ");
        int voixJosephine = sc.nextInt();

        System.out.println("\nNombre de voix pour Vincent Escreau : ");
        int voixEscreau = sc.nextInt();

        System.out.println("Nombre d'abtsentionniste' : ");
        int abstentions=sc.nextInt();

        if  (abstentions + voixJosephine + voixEscreau > votants){
            System.err.println("\nMontant total des votes par encore atteints");
        } 
        if (votants < 150000) {
            System.err.println("\nErreur nombre de voix trop élevés.");
        }
    }
}/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/


