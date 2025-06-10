package Pratices;
import java.util.Scanner;

public class casPratique2 {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);

   //INIALISATION DES SOLDES
    System.out.println("\nSolde du compte A :");
    double soldeA = clavier.nextDouble();
    System.out.println("\nSolde du compte B : ");
    double soldeB = clavier.nextDouble();

    //CHOIX DU MONTANT A TRANSFERER
    System.out.println("\nChoix du montant à transferer du compte A vers le compte B :");
    Double montant = clavier.nextDouble();

    if(montant > soldeA){
        System.out.println("\nTransfert impossible, fond insuffisant");
    } else {
        double nouveauSoldeA = soldeA -=montant;
        double nouveauSoldeB = soldeB +=montant;
        
        System.out.println("\nVotre transfert de " +montant+ " vers le compte B à bien été effectué.\nIl vous reste à présent "+nouveauSoldeA+
        "EUR sur le compte A." );
        System.out.println("\nLe compte B dispose à present de "+nouveauSoldeB);
    }


    clavier.close();
    }
}
