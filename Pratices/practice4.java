package Pratices;
import java.util.Scanner;

public class practice4 {
    public static void main(String [] agrs){
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Quantité de lait (en cl) : ");
            int lait = sc.nextInt();
            
            System.out.println("Quantité de céréales (en g) : ");
            int cereal = sc.nextInt();
    
            if (lait <= 0 && cereal <= 0) {
                System.out.println("Ma brique de lait ET mon paquet de céréales sont vides, je ne peux pas prendre mon petit déjeuner");
            } else if (lait <= 0) {
                System.out.println("Ma brique de lait est vide, je ne peux pas prendre mon petit déjeuner");
            } else if (cereal <= 0) {
                System.out.println("Mon paquet de céréales est vide, je ne peux pas prendre mon petit déjeuner");
            } else {
                System.out.println("Je peux prendre mon petit déjeuner");
            }
    
            sc.close();
    }
}
