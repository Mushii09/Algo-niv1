package Pratices;
import java.util.Scanner;

public class casPratique1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int age;

        System.out.print("Qu'elle est votre âge ?");
        age=clavier.nextInt();

        if (age >=18){
            
        System.out.print("Vous avez "+ age + " , vous êtes majeur.");
        } else {
            System.out.println("Vous avez "+age + " , vous êtes mineur.");
        }
        clavier.close();
    }
}
